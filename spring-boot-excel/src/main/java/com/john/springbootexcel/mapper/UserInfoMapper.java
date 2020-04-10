/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexcel.mapper;

import com.john.mybatis.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author huangjy
 * @since v1.0
 */
@Mapper
public interface UserInfoMapper {

    List<UserInfo> queryAll();
}
