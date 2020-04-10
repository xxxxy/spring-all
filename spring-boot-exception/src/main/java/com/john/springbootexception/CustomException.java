/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-02-18</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot异常
 *
 * 4xx,5xx是模糊匹配
 * 优先级:动态页面> 静态页面; 404(精确匹配) > 4xx(模糊匹配);
 * @author huangjy
 * @since v1.0
 */
@RestController
public class CustomException {
    @GetMapping("/test")
    public String test() {
        int i = 1 / 0;
        return "test";
    }
}
