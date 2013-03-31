package com.gao.first;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.IOException;

/**
 * User: wangchen.gpx
 * Date: 13-3-29
 * Time: 下午4:54
 * 这个类主要是用来读取excel的文件内容
 */
public class ReadExcelTest {
    public static void main(String[] args) throws IOException, BiffException {
        //首先创建一个workbook
        Workbook workbook = Workbook.getWorkbook(new File("D:/单元测试.xls"));
        Sheet sheet = workbook.getSheet(0);

        int rows = sheet.getRows();
        for (int i = 0; i < rows; i++) {
            Cell[] row = sheet.getRow(i);
            for (Cell cell : row) {
                String contents = cell.getContents();
                System.out.print(contents + "  ");
            }
            System.out.println();
        }

        workbook.close();
    }
}
