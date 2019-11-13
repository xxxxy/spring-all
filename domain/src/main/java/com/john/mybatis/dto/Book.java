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

/**
 *
 * @author huangjy
 * @since v1.0
 */
@Data
public class Book {

    private Integer id;
    private String bookName;
    private String author;
    private String isbn;
}
