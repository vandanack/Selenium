package ExcelOperations;

import Library.ExcelReadOps;

public class ReadDataUsingLib {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExcelReadOps ob = new ExcelReadOps("D:\\\\SeleniumExcel\\\\CredsForAutomation.xlsx");
		System.out.println(ob.getData(1, 0, 0));
	}

}
