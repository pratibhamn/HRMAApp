package hrma.generics;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String ReadData(String sheet,int m,int n) throws EncryptedDocumentException, InvalidFormatException, IOException{
		File f=new File("D:\\HRMA\\HRM2\\data\\testData.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		String s = wb.getSheet(sheet).getRow(m).getCell(n).getStringCellValue();
		return s;
		
	}

}
