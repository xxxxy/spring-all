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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangjy
 * @since v1.0
 */
@Controller
public class JspController {

    @GetMapping("/helloJsp")
    public String helloJsp(Model model) {
        model.addAttribute("msg", "this is JSP test!");
        return "test";
    }
}
