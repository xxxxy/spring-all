/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-02-11</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootupload.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author huangjy
 * @since v1.0
 */
@ControllerAdvice
public class ControllerAdviceForException1 {
    /*@ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html;charset=utf-8");
        System.out.println("上传文件大小超出限制!");
        PrintWriter writer = response.getWriter();
        writer.write("上传文件大小超出限制!");
        writer.flush();
        writer.close();
    }*/

    @ExceptionHandler(Exception.class)
    public ModelAndView uploadExcetion(MaxUploadSizeExceededException e){
        ModelAndView modelAndView = new ModelAndView("uploadErr");
        modelAndView.addObject("errorMsg", "上传文件大小超出限制!");
        return modelAndView;
    }
}
