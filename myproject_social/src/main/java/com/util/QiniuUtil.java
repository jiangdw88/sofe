package com.util;



import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;


import javax.crypto.Mac;
import javax.security.auth.message.AuthException;
import java.io.File;
import java.io.IOException;


/**
 * @author 创建人:< Chenmq>
 * @project 项目:<>
 * @date 创建时间:< 2017/8/30>
 * @comments: 说明:< //七牛云图片配置 >
 */
public class QiniuUtil {


    //上传 file是上传的文件地址，key是上传的图片名称
    public static void upload(String file, String key) {
        //构造一个带指定Region对象的配置类
        Configuration cfg = new Configuration(Region.region2());
//...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        String accessKey = "KLzzhVAfGtyD6hWWgUJgJXoxNLnjD6H9kr2RYO7q";
        String secretKey = "A1hf2UmYPQxQ5uAA38GVT48ldXyvXGhBm1ItCPLD";
        String bucket = "zfc";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        try {
            Response response = uploadManager.put(file, key, upToken);
            System.out.println(response);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }

        }
    }
}