package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String fetchValue(String sheetName,int row , int colunm) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/testdata/Data.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(colunm).getStringCellValue();
    }
}
