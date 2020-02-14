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

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangjy
 * @since v1.0
 */
@ControllerAdvice
public class GlobalData {
    @ModelAttribute(value = "data")
    public Map<String, Object> data() {
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("name", "john huang");
        dataMap.put("age", "26");
        return dataMap;
    }

    @InitBinder("a")
    public void initA(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

    @InitBinder("b")
    public void initB(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }
}
