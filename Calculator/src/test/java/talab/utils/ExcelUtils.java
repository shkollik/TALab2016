package talab.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExcelUtils {
    private InputStream input;
    private HSSFWorkbook workBook;

    public ExcelUtils() {
        try {
            input = new FileInputStream("src\\test\\resources\\testData.xls");
            workBook = new HSSFWorkbook(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[][] parse(String nameSheet, String dataFormat) {
        Sheet sheet = workBook.getSheet(nameSheet);
        int rows = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] result = new Object[rows][column];


        for (int i = 0; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < column; j++ ) {
                Cell cell = row.getCell(j);
                if(dataFormat.equals("long")){
                    result[i][j] = (long)cell.getNumericCellValue();
                }
                else if (dataFormat.equals("double")){
                    result[i][j] = (double)cell.getNumericCellValue();
                }
                else if (dataFormat.equals("string")){
                    result[i][j] = cell.getStringCellValue();
                }

            }
        }

        return result;
    }
}