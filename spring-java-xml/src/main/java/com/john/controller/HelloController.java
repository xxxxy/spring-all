/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-14</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.controller;

import com.john.mybatis.dto.Book;
import com.john.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    //@GetMapping(value = "/hello", produces = "text/html;charset=utf8")
    //public String hello() {
    //return "hello world Spring!囧黄";
    //}

    @GetMapping(value = "/hello", produces = "text/html;charset=utf8")
    public String hello() {
        return helloService.sayHi();
    }

    @GetMapping("/showBook")
    public Book showBook() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("张三");
        book.setIsbn("123456");
        return book;
    }
}
