package repeatDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Extract {
public Object[][] Get() throws EncryptedDocumentException, IOException{
	FileInputStream file = new FileInputStream("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\AvnProject\\src\\test\\resources\\ExcelSheet.xlsx");

       Workbook book = WorkbookFactory.create(file);
       
       Sheet sheet = book.getSheet("Sheet1");
       
          short cellsize = sheet.getRow(0).getLastCellNum();
          
           int rowcount = sheet.getLastRowNum();
           
Object[][] obj = new Object[rowcount][cellsize];

for(int i=0; i<rowcount; i++) {
	for(int j=0; j<cellsize; j++) {
	obj[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
	}
}

return obj;
}
}
