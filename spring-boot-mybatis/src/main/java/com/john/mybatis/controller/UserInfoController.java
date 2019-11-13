/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-07</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.controller;

import com.john.mybatis.bean.UserInfo;
import com.john.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
public class UserInfoController {

    @Autowired
    public UserInfoService userInfoService;

    @PostMapping("/save")
    public Integer save(@RequestBody UserInfo userInfo) {
        return userInfoService.save(userInfo);
    }

    @PutMapping("/update")
    public Integer updateById(@RequestBody UserInfo userInfo) {
        return userInfoService.updateById(userInfo);
    }

    @DeleteMapping("/deleteById/{id}")
    public Integer deleteById(@PathVariable("id") Integer id) {
        return userInfoService.deleteById(id);
    }

    @GetMapping("/selectById/{id}")
    public UserInfo selectById(@PathVariable("id") Integer id) {
        return userInfoService.selectById(id);
    }
}
