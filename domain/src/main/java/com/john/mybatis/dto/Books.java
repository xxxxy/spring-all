/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2019-11-11</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.mybatis.dto;

import lombok.Data;

import java.util.List;

/**
 *
 * @author huangjy
 * @since v1.0
 */
@Data
public class Books {
    private List<Book> books;
}
