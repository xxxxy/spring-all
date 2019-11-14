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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class JsonController {

    @GetMapping("/showBook")
    public Book showBook() {
        Book book = new Book();
        book.setId(1);
        book.setBookName("穷爸爸.富爸爸");
        book.setAuthor("罗伯特.清歧");
        return book;
    }
}
