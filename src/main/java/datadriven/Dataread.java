package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataread {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	private static XSSFRow row;
	
	public static void setExcelfile(String path,String sheetname){
		try {
			FileInputStream ipfile = new FileInputStream(path);
			workbook = new XSSFWorkbook(ipfile);
			sheet= workbook.getSheet(sheetname);
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static String getceldata(int Rownum, int Celnum){
		try {
			cell=sheet.getRow(Rownum).getCell(Celnum);
			String celdata = cell.getStringCellValue();
			return celdata;
		} catch (Exception e) {
			return "";
		}
		}
	
	public static void setceldata(String result, int rownum, int colnum){
		try {
			row = sheet.getRow(rownum);
			cell=row.getCell(colnum, row.RETURN_BLANK_AS_NULL);
		if(cell==null){
			cell=row.createCell(colnum);
			cell.setCellValue(result);
		}else{
			cell.setCellValue(result);
		}
		FileOutputStream foutput = new FileOutputStream("C:/Users/rbharga1/workspace/org.com.testng/src/main/java/Testdata"
				+ ""+"/MakemytripTestdata.xlsx");
		workbook.write(foutput);
		foutput.flush();
		foutput.close();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

}