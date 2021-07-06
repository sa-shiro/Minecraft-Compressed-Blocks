package com.github.sa_shiro.compressedblocks.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.resources.ResourcePack;
import net.minecraft.resources.ResourcePackFileNotFoundException;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ResourceLocationException;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

public class ResourcePackLoader extends ResourcePack {

    private static final Logger LOGGER = LogManager.getLogger();

    public ResourcePackLoader(File file) {
        super(file);
    }

    private File getFile(String name) {
        File file1 = new File(this.file, name);
        if (file1.isFile()) {
            return file1;
        }
        return null;
    }

    @Override
    protected InputStream getResource(String name) throws IOException {
        File file1 = this.getFile(name);
        if (file1 == null) {
            throw new ResourcePackFileNotFoundException(this.file, name);
        } else {
            return new FileInputStream(file1);
        }
    }

    @Override
    protected boolean hasResource(String name) {
        return this.getFile(name) != null;
    }

    @Override
    public Collection<ResourceLocation> getResources(ResourcePackType p_225637_1_, String p_225637_2_, String p_225637_3_, int p_225637_4_, Predicate<String> p_225637_5_) {
        File file1 = new File(this.file, p_225637_1_.getDirectory());
        List<ResourceLocation> list = Lists.newArrayList();
        this.listResources(new File(new File(file1, p_225637_2_), p_225637_3_), p_225637_4_, p_225637_2_, list, p_225637_3_ + "/", p_225637_5_);
        return list;
    }

    private void listResources(File p_199546_1_, int p_199546_2_, String p_199546_3_, List<ResourceLocation> p_199546_4_, String p_199546_5_, Predicate<String> p_199546_6_) {
        File[] afile = p_199546_1_.listFiles();
        if (afile != null) {
            for (File file1 : afile) {
                if (file1.isDirectory()) {
                    if (p_199546_2_ > 0) {
                        this.listResources(file1, p_199546_2_ - 1, p_199546_3_, p_199546_4_, p_199546_5_ + file1.getName() + "/", p_199546_6_);
                    }
                } else if (!file1.getName().endsWith(".mcmeta") && p_199546_6_.test(file1.getName())) {
                    try {
                        p_199546_4_.add(new ResourceLocation(p_199546_3_, p_199546_5_ + file1.getName()));
                    } catch (ResourceLocationException resourcelocationexception) {
                        LOGGER.error(resourcelocationexception.getMessage());
                    }
                }
            }
        }

    }

    private void crawl(File rootPath, int maxDepth, String namespace, Collection<ResourceLocation> allResources, String path, Predicate<String> filter) {
        File[] files = rootPath.listFiles();
        if (path.equals("compressedblocks/compressedblocks/")) path = "compressedblocks/";
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (maxDepth > 0)
                        this.crawl(file, maxDepth - 1, namespace, allResources, path + file.getName() + "/", filter);
                } else if (!file.getName().endsWith(".mcmeta") && filter.test(file.getName())) {
                    try {
                        String d = path;
                        if (path.contains("compressedblocks/")) {
                            path = path.replaceFirst("compressedblocks/", "");
                        }
                        String s = path;
                        ResourceLocation loc = new ResourceLocation(namespace, path + file.getName());
                        allResources.add(loc);
                    } catch (ResourceLocationException e) {

                    }
                }
            }
        }
    }

    @Override
    public Set<String> getNamespaces(ResourcePackType type) {
        Set<String> set = Sets.newHashSet();
        File file1 = new File(this.file, type.getDirectory());
        File[] afile = file1.listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);
        if (afile != null) {
            for (File file2 : afile) {
                String s = getRelativePath(file1, file2);
                if (s.equals(s.toLowerCase(Locale.ROOT))) {
                    set.add(s.substring(0, s.length() - 1));
                } else {
                    this.logWarning(s);
                }
            }
        }

        return set;
    }

    @Override
    public void close() {
    }

    @Nonnull
    @Override
    public String getName() {
        return "CB Resources";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}