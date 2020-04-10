/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexcel.service.impl;

import com.john.mybatis.bean.UserInfo;
import com.john.springbootexcel.mapper.UserInfoMapper;
import com.john.springbootexcel.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author huangjy
 * @since v1.0
 */
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> queryAll() {
        return userInfoMapper.queryAll();
    }
}
