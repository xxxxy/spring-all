/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
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
public class ExcelData {
    /**
     * Excel 名称
     */
    private String fileName;

    /**
     * Excel 表头
     */
    private String[] heads;

    /**
     * Excel 数据
     */
    private List<String[]> dataList;
}
