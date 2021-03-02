package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	public static void main(String[] args) {
		//getrowcount();
		getxlsrowcountString();
		getxlsrowcountNuber();
	}

	public static void getrowcount(){

		try {
			String ProjectPath = System.getProperty("user.dir");
			XSSFWorkbook worbook = new XSSFWorkbook(ProjectPath+"/Excel/Excel.xlsx");
			XSSFSheet sheet= worbook.getSheet("Sheet1");
			int count = sheet.getPhysicalNumberOfRows();
			System.out.println("Number Of Rows: "+count);

		} 
		catch (Exception exp) {

			System.out.println( exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}



	}
	public static void getxlsrowcountString(){

		try {
			String ProjectPath = System.getProperty("user.dir");
			XSSFWorkbook worbook = new XSSFWorkbook(ProjectPath+"/Excel/Excel.xlsx");
			XSSFSheet sheet= worbook.getSheet("Sheet1");
			int count = sheet.getPhysicalNumberOfRows();
			System.out.println("Number Of Rows: "+count);
			String cell = sheet.getRow(1).getCell(0).getStringCellValue();
			
			
			
			System.out.println(cell);

		}
		catch (Exception exp) {

			System.out.println( exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void getxlsrowcountNuber(){

		try {
			String ProjectPath = System.getProperty("user.dir");
			XSSFWorkbook worbook = new XSSFWorkbook(ProjectPath+"/Excel/Excel.xlsx");
			XSSFSheet sheet= worbook.getSheet("Sheet1");
			int count = sheet.getPhysicalNumberOfRows();
			System.out.println("Number Of Rows: "+count);
			double celldata = sheet.getRow(1).getCell(1).getNumericCellValue();
			
			
			System.out.println(celldata);

		}
		catch (Exception exp) {

			System.out.println( exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

}
}
