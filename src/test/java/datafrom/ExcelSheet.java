package datafrom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
public Object[][] data() throws EncryptedDocumentException, IOException{
	
	FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\AvnProject\\src\\test\\resources\\ExcelSheet.xlsx");
	
	    Workbook book = WorkbookFactory.create(file);
	  Sheet sheet = book.getSheet("Sheet1");
	  
	    short cellSize = sheet.getRow(0).getLastCellNum();
	    
	       int rowCount = sheet.getLastRowNum();
	       
	       //here we will create a object of two dimensional object class 
	       
	       Object [][] object = new Object[rowCount][cellSize];
	       
	       for(int i=0; i<rowCount; i++) {
	    	   for(int j=0; j<cellSize; j++) {
	    		    object[i][j] =sheet.getRow(i).getCell(j).getStringCellValue();
	    	   }
	       }
	  
	return object;
}
}
