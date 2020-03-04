package BrowserFirst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestInMethod {
	
	
	
	
	private static String output(XSSFSheet sheet, int rownr, int colnr) {
        /*
         * This method displays the total value of 
         */
        XSSFRow row = sheet.getRow(rownr);
        XSSFCell cell = row.getCell(colnr);
        String cellOut = ""+cell;    
                return cellOut;
                
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


    public static void finish() {

        System.exit(0);
    }

	public String GetStepName(String fileName, String cellContent,int i,int j) throws IOException {
        int rownr=0, colnr = j;
        InputStream input = new FileInputStream(fileName);

        XSSFWorkbook wb = new XSSFWorkbook(input);
        XSSFSheet sheet = wb.getSheetAt(0);

        rownr = findRow(sheet, cellContent);
        rownr = rownr+i;
        colnr = colnr-1;
        String giveBack = output(sheet, rownr, colnr);
        
        //finish();
        return giveBack;
	}

}
