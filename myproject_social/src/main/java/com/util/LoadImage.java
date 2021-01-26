package com.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LoadImage {
    //接收多个图片(返回图片列表名)
    public static List<String> uploadManyImage(MultipartFile[] files) throws IOException {
        System.out.println(files.length);
        // 图片存储路径
        String path = "D:\\image";
        // 判断是否有路径
        if (!new File(path).exists()) {
            new File(path).mkdirs();
        }
        List<String> list = new ArrayList<>();
        for(int i = 0;i<files.length;i++) {
            String fileName = UUID.randomUUID().toString().replace("-","") + ".jpg";
            File tempFile = new File(path,fileName);
            System.out.println(tempFile.getPath());
            if (!tempFile.exists()) {
                try {
                    tempFile.createNewFile();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            try {
                //保存文件
                //使用此方法保存必须要绝对路径且文件夹必须已存在,否则报错
                files[i].transferTo(tempFile);
                QiniuUtil.upload(tempFile.getPath(),fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件是："+fileName);
            list.add(fileName);
        }
        return list;
    }
    //接收单个图片(返回列表名)
    public static String uploadOneImage(MultipartFile file) throws IOException{
        // 图片存储路径
        String path = "D:\\image";
        // 判断是否有路径
        if (!new File(path).exists()) {
            new File(path).mkdirs();
        }
        String fileName = UUID.randomUUID().toString().replace("-","") + ".jpg";
        File tempFile = new File(path,fileName);
        QiniuUtil.upload(tempFile.getPath(),fileName);
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }
        file.transferTo(tempFile);
        return fileName;
    }
}
