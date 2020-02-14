/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-02-11</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.controlleradvice;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author huangjy
 * @since v1.0
 */
@RestController
public class BookController {
    @PostMapping("/addBook")
    public void addBook(@ModelAttribute("b") Book b ,@ModelAttribute("a") Author a){
        System.out.println(b);
        System.out.println(a);
    }
}
