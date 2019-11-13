/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-11</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootfreemarker.controller;

import com.google.common.collect.Lists;
import com.john.mybatis.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author huangjy
 * @since v1.0
 */
@Controller
public class FreemarkerBookController {

    @GetMapping("/freemarkerqueryBooks")
    public String freemarkerqueryBooks(Model model) {
        List<Book> list = Lists.newArrayList();
        Book book1 = new Book();
        book1.setId(1);
        book1.setBookName("红楼梦");
        book1.setAuthor("曹雪芹");
        book1.setIsbn("11111");
        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("三国志");
        book2.setAuthor("陈寿");
        book2.setIsbn("2222");
        Book book3 = new Book();
        book3.setId(3);
        book3.setBookName("哆啦A梦");
        book3.setAuthor("藤子.F.不二雄");
        book3.setIsbn("333");
        list.add(book1);
        list.add(book2);
        list.add(book3);
        model.addAttribute("books", list);
        return "books";
    }
}
