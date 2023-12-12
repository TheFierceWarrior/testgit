import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx2 {

	public static void main(String[] args) {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("SheetTest");
			
			Row firstRow = sheet.createRow(0);
			firstRow.createCell(0).setCellValue("Value 1");
			firstRow.createCell(1).setCellValue("Value 2");
			
			Row secondRow = sheet.createRow(1);
			secondRow.createCell(0).setCellValue("Value 3");
			secondRow.createCell(1).setCellValue("Value 4");
			
			sheet.getRow(1).createCell(3).setCellValue("Value 5");
			
			FileOutputStream out = new FileOutputStream("C:\\src\\sample1.xlsx");
			workbook.write(out);
			workbook.close();
			out.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}