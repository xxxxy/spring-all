/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-07</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.mapper;

import com.john.mybatis.bean.UserInfo;
import org.apache.ibatis.annotations.*;

/**
 * @author huangjy
 * @since v1.0
 */
//@Component
@Mapper
public interface UserInfoMapper {
    @Insert("insert into user_info (user_name,`password`,address) VALUES(#{userName} ,#{password} ,#{address})")
    int save(UserInfo user);

    @Update("update user_info set user_name = #{userName} , password = #{password} ,address = #{password} WHERE id = #{id}")
    int updateById(UserInfo user);

    @Delete("delete from user_info where id = #{id} ")
    int deleteById(Integer id);

    @Select("select * from user_info where id = #{id} ")
    @Results(id = "userInfo", value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "userName", column = "user_name", javaType = String.class),
            @Result(property = "password", column = "password", javaType = String.class),
            @Result(property = "address", column = "address", javaType = String.class)
    })
    UserInfo selectById(Integer id);
}
