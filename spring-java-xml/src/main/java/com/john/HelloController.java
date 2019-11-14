/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-14</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = "text/html;charset=utf8")
    public String hello() {
        return "hello world Spring!囧黄";
    }
}
