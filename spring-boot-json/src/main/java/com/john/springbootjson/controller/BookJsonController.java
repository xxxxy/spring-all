/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-18</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootjson.controller;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.google.common.collect.Lists;
import com.john.mybatis.dto.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


/**
 * @author huangjy
 * @since v1.0
 */
//@Controller
@RestController
public class BookJsonController {

    //@ResponseBody
    @GetMapping("/queryBooks")
    public List<Book> queryBooks() {
        Book book = new Book();
        book.setId(1);
        book.setBookName("三国志");
        book.setAuthor("陈寿");
        book.setIsbn("123456");
        book.setCreateTime(new Date());

        Book book1 = new Book();
        book1.setId(2);
        book1.setBookName("明朝那些事");
        book1.setAuthor("江南明月");
        book1.setIsbn("54321");
        book1.setCreateTime(new Date());

        List<Book> books = Lists.newArrayList();
        books.add(book);
        books.add(book1);
        return books;
    }
}
