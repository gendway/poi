package com.demo;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class POIDemo {

    public static void main(String[] args) throws IOException {
        HSSFWorkbook wb = new HSSFWorkbook();   //工作簿
        HSSFSheet sheet = wb.createSheet("测试");  //工作表
        HSSFRow row = sheet.createRow(0);      //创建行，索引从0开始
        HSSFCell cell = row.createCell(0);      //创建列
        cell.setCellValue("测试cell");            //给单元格赋值

        sheet.setColumnWidth(0,5000);
        //规律20个字符，一个字符占256个大小，跟字体有关
        File file = new File("e:/poitest.xls");
        wb.write(file);
    }

}
