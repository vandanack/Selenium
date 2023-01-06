package ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("D:\\SeleniumExcel\\CredsForAutomation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet xs = wb.getSheetAt(0);
		
		int tot = xs.getLastRowNum();
		
		for(int i=0;i<=tot; i++)
		{
			System.out.println("Value in Row "+(i+1)+" Column 1 is :"+xs.getRow(i).getCell(0).getStringCellValue());
		}
		
		wb.close();
		
		
	}

}
