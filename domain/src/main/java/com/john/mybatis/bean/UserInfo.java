/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-07</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huangjy
 * @since v1.0
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 8989403659515087111L;

    private Integer id;

    private String userName;

    private String password;

    private String address;

}
