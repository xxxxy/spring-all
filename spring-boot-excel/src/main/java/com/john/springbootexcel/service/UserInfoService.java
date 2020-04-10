/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexcel.service;

import com.john.mybatis.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author huangjy
 * @since v1.0
 */
@Service
public interface UserInfoService {
    List<UserInfo> queryAll();
}
