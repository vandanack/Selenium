package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOps {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	public ExcelReadOps(String path) throws Exception
	{
		File f = new File(path);
		fis =  new FileInputStream(f);
		wb  = new XSSFWorkbook(fis);
	}
	
	public String getData(int sheetIndex, int row , int col)
	{
		XSSFSheet xs= wb.getSheetAt(sheetIndex);
		String value = xs.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	
	
	public int rowCount(int sheetNum)
	{
		XSSFSheet xs= wb.getSheetAt(sheetNum);
		return xs.getLastRowNum()+1;
	}

}
