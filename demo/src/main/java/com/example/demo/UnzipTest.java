package com.example.demo;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.*;

/**
 * @author: huangzuwang
 * @date: 2019-11-15 11:20
 * @description:
 */
public class UnzipTest {

    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\Isuzu\\Desktop\\test.zip";
        unzip(new File(path), "D:\\data");
    }

    public static void unzip(File zipFile, String descDir) {
        try (ZipArchiveInputStream inputStream = getZipFile(zipFile)) {
            File pathFile = new File(descDir);
            if (!pathFile.exists()) {
                pathFile.mkdirs();
            }
            ZipArchiveEntry entry = null;
            while ((entry = inputStream.getNextZipEntry()) != null) {
                if (entry.isDirectory()) {
                    File directory = new File(descDir, entry.getName());
                    directory.mkdirs();
                } else {
                    OutputStream os = null;
                    try {
                        os = new BufferedOutputStream(new FileOutputStream(new File(descDir, entry.getName())));
                        //输出文件路径信息
//                        LOG.info("解压文件的当前路径为:{}", descDir + entry.getName());
                        IOUtils.copy(inputStream, os);
                    } finally {
                        IOUtils.closeQuietly(os);
                    }
                }
            }
            final File[] files = pathFile.listFiles();
            if (files != null && files.length == 1 && files[0].isDirectory()) {
                // 说明只有一个文件夹
//                FileUtils.copyDirectory(files[0], pathFile);
                //免得删除错误， 删除的文件必须在/data/demand/目录下。
                boolean isValid = files[0].getPath().contains("/data/www/");
                if (isValid) {
//                    FileUtils.forceDelete(files[0]);
                }
            }
//            LOG.info("******************解压完毕********************");

        } catch (Exception e) {
//            LOG.error("[unzip] 解压zip文件出错", e);
        }
    }

    private static ZipArchiveInputStream getZipFile(File zipFile) throws Exception {
        return new ZipArchiveInputStream(new BufferedInputStream(new FileInputStream(zipFile)));
    }

}
