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

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class DataController {
    @RequestMapping("/getData")
    public String getData(Model model) {
        Map<String, Object> map = model.asMap();
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        return "hello";
    }
}
