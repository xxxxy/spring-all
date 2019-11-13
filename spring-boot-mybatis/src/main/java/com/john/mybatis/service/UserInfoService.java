/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-07</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.service;

import com.john.mybatis.bean.UserInfo;

/**
 * @author huangjy
 * @since v1.0
 */
public interface UserInfoService {
    Integer save(UserInfo userInfo);

    Integer updateById(UserInfo userInfo);

    Integer deleteById(Integer id);

    UserInfo selectById(Integer id);
}
