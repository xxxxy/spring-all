/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-03-10</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.springbootexcel.helper;

import com.john.mybatis.dto.ExcelData;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Excel的导入/导出操作
 *
 * @author huangjy
 * @since v1.0
 */
@Slf4j
@Component
public final class ExcelHelper {
    private ExcelHelper(){
    }

    /**
     * 导出Excel
     */
    public static void ExcelExport(HttpServletResponse response, ExcelData excelData) {
        try {
            //初始化一个HSSFWorkbook对象
            HSSFWorkbook workbook = new HSSFWorkbook();

            //创建一个Sheet(一个workbook中可添加多个sheet)
            HSSFSheet sheet = workbook.createSheet("sheet");

            //设置行头
            setTitle(workbook, sheet, excelData.getHeads());

            //填充数据
            fillData(sheet, excelData.getDataList());

            //设置浏览器下载
            setBrowser(response, workbook, excelData.getFileName());
            log.info("导出Excel成功!");
        } catch (Exception e) {
            log.info("导出Excel失败!原因:{}", e.getMessage());
        }
    }


    /**
     * 设置Excel表头
     *
     * @param workbook
     * @param sheet
     * @param heads
     */
    private static void setTitle(HSSFWorkbook workbook, HSSFSheet sheet, String[] heads) {
        //在sheet中创建一行
        HSSFRow row = sheet.createRow(0);

        //设置列宽
        for (int i = 0; i <= heads.length; i++) {
            sheet.setColumnWidth(i, 15 * 256);
        }

        //设置单元格样式
        HSSFCellStyle cellStyle = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        cellStyle.setFont(font);
        cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //创建每一行中的单元格
        HSSFCell cell = null;
        for (int i = 0; i < heads.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(heads[i]);
            cell.setCellStyle(cellStyle);
        }
    }

    /**
     * 填充Excel数据
     *
     * @param sheet    页
     * @param dataList 数据源
     */
    private static void fillData(HSSFSheet sheet, List<String[]> dataList) {
        int rowNum = 1;

        for (int i = 0; i < dataList.size(); i++) {
            HSSFRow row = sheet.createRow(rowNum);
            for (int j = 0; j < dataList.get(i).length; j++) {
                row.createCell(j).setCellValue(dataList.get(i)[j]);
            }
            rowNum++;
        }
        log.info("填充数据成功!");
    }

    /**
     * 设置浏览器下载
     *
     * @param response
     * @param workbook
     * @param fileName
     */
    private static void setBrowser(HttpServletResponse response, HSSFWorkbook workbook, String fileName) {
        try {
            //重置response
            response.reset();

            //设置返回值头
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);

            //创建一个输出流
            OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());

            //将Excel写入到流中
            workbook.write(outputStream);

            //关闭流
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 导出文件到本地
     *
     * @param workbook
     * @param fileName
     */
    private static void setLocal(HSSFWorkbook workbook, String fileName){
        try {
            //创建一个输出流
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            OutputStream outputStream = new BufferedOutputStream(fileOutputStream);

            //将Excel写入到流中
            workbook.write(outputStream);

            //关闭流
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
