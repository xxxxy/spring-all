/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-12-04</p>
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
public class UploadsController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] files, HttpServletRequest request) {
        String format = sdf.format(new Date());
        ServletContext servletContext = request.getServletContext();
        String path = servletContext.getRealPath("/img") + format;

        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        for (MultipartFile multipartFile : files) {
            String oldFileName = multipartFile.getOriginalFilename();
            String uuid = UUID.randomUUID().toString();
            String newFileName = uuid + oldFileName.substring(oldFileName.lastIndexOf("."));
            try {
                multipartFile.transferTo(new File(folder, newFileName));
                String newPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/img" + format + "/" + newFileName;
                System.out.println(newPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }
}
