package ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("D:\\SeleniumExcel\\WritingVal.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook xb = new XSSFWorkbook(fis);
		XSSFSheet xs = xb.getSheetAt(0);
		
		xs.getRow(0).createCell(1).setCellValue("Hello");
		FileOutputStream op = new FileOutputStream(f);
		xb.write(op);
		
		xb.close();
		
		
	}

}
