/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-20</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class UploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        //设置上传文件地址
        String format = sdf.format(new Date());
        ServletContext servletContext = request.getServletContext();
        String path = servletContext.getRealPath("/img/") + format;

        //如果没有这个目录,则创建
        File folder = new File(path);
        if (!folder.exists()) {
            boolean mkdirs = folder.mkdirs();
            System.out.println(mkdirs);
        }

        //设置上次文件名
        String oldFileName = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString();
        String newFileName = uuid + oldFileName.substring(oldFileName.lastIndexOf("."));

        //上传文件
        try {
            file.transferTo(new File(folder, newFileName));
            return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/img/" + format + "/" + newFileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
