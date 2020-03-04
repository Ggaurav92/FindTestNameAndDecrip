package BrowserFirst;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestFirst {
	
	public static void main(String[] args) throws IOException{

        String fileName = "C:\\Users\\P10444427\\Desktop\\Java\\TestWorksheet.xlsx";
        String cellContent = "g1";
        int rownr=0, colnr = 8;

        InputStream input = new FileInputStream(fileName);

        XSSFWorkbook wb = new XSSFWorkbook(input);
        XSSFSheet sheet = wb.getSheetAt(0);

        rownr = findRow(sheet, cellContent);
        colnr = colnr-1;
        output(sheet, rownr, colnr);

        finish();
    }//End of PSVM

    private static void output(XSSFSheet sheet, int rownr, int colnr) {
        /*
         * This method displays the total value of 
         */
    	System.out.println(rownr);
        XSSFRow row = sheet.getRow(rownr);
        XSSFCell cell = row.getCell(colnr);

                System.out.println("Your total is: " + cell);           
    }//end of output

    private static int findRow(XSSFSheet sheet, String cellContent) {
        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getCellType() == CellType.STRING) {
                    if (cell.getRichStringCellValue().getString().trim().equals(cellContent)) {
                        return row.getRowNum();  
                    }
                }
            }
        }               
        return 0;
    }


    private static void finish() {

        System.exit(0);
    }
}   



