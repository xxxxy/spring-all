/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-07</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.service.impl;

import com.john.mybatis.bean.UserInfo;
import com.john.mybatis.mapper.UserInfoMapper;
import com.john.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangjy
 * @since v1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Integer save(UserInfo userInfo) {
        return userInfoMapper.save(userInfo);
    }

    @Override
    public Integer updateById(UserInfo userInfo) {
        return userInfoMapper.updateById(userInfo);
    }

    @Override
    public Integer deleteById(Integer id) {
        return userInfoMapper.deleteById(id);
    }

    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }


}
