/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-12-06</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * @author huangjy
 * @since v1.0
 */
@Repository
public class UserDao {

    @Autowired
    private RedisTemplate redisTemplate;

    public void set(String key, String value) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key).toString();
    }


}
