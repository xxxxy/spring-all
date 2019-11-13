/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-08</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootthymeleaf.controller;

import com.google.common.collect.Lists;
import com.john.mybatis.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;

/**
 * @author huangjy
 * @since v1.0
 */
@Controller
public class ThymeleafBookController {

    @Autowired
    private TemplateEngine templateEngine;

    @GetMapping("/queryBook")
    public String queryBook(Model model) {
        List<Book> bookList = Lists.newArrayList();
        Book book1 = new Book();
        book1.setId(1);
        book1.setBookName("红楼梦");
        book1.setAuthor("曹雪芹");
        book1.setIsbn("9787534243752");

        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("三国演义");
        book2.setAuthor("罗贯中");
        book2.setIsbn("9787510101960");

        Book book3 = new Book();
        book3.setId(3);
        book3.setBookName("西游记");
        book3.setAuthor("吴承恩");
        book3.setIsbn("9787534830426");

        Book book4 = new Book();
        book4.setId(4);
        book4.setBookName("水浒传");
        book4.setAuthor("施耐庵");
        book4.setIsbn("9787515700403");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        model.addAttribute("bookList", bookList);
        return "book";
    }

    /**
     * 支持js
     */
    @GetMapping("/supportJs")
    public String supportJs(Model model) {
        model.addAttribute("username", "囧黄");
        return "supportJs";
    }

    /**
     * 自定义
     */
    @GetMapping("/introduction")
    public void introduction() {
        Context context = new Context();
        context.setVariable("username", "囧黄");
        context.setVariable("gender", "male");
        context.setVariable("from", "china");
        context.setVariable("position", "程序员");
        String introduction = templateEngine.process("introduction", context);
        System.out.println(introduction);
    }
}
