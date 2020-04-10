/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexcel.controller;

import com.alibaba.fastjson.JSON;
import com.john.mybatis.bean.UserInfo;
import com.john.mybatis.dto.ExcelData;
import com.john.springbootexcel.helper.ExcelHelper;
import com.john.springbootexcel.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author huangjy
 * @since v1.0
 */
@RestController
@Slf4j
public class ExcelController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 导出Excel
     *
     * @return
     */
    @PostMapping("/exportExcel")
    @ResponseBody
    public String exportExcel(HttpServletResponse response, @RequestBody List<Integer> ids) {
        List<UserInfo> userInfos = userInfoService.queryAll();

        log.info("---userInfos---{}", JSON.toJSONString(userInfos));
        ExcelData excelData = new ExcelData();
        excelData.setFileName("");
        //excelData.setHeads();
        ExcelHelper.ExcelExport(response, excelData);
        return null;
    }
}
