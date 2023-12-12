import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\src\\sample.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			// For Rows
//			System.out.println(sheet.getLastRowNum()); //Starts from 0
//			System.out.println(sheet.getPhysicalNumberOfRows()); //Starts from 1 - Only non empty cells
//			
//			// For Columns
//			System.out.println(sheet.getRow(0).getLastCellNum()); // Starts from 1
//			System.out.println(sheet.getRow(0).getPhysicalNumberOfCells()); // Starts from 1
			
//			for(int i=0; i<sheet.getRow(0).getLastCellNum(); i++) {
//				if(sheet.getRow(0).getCell(i) != null) {
//					switch(sheet.getRow(0).getCell(i).getCellType()) {
//					case STRING:
//						System.out.println(sheet.getRow(0).getCell(i).getStringCellValue());
//						break;
//					case NUMERIC:
//						System.out.println(sheet.getRow(0).getCell(i).getNumericCellValue());
//						break;
//					case BOOLEAN:
//						System.out.println(sheet.getRow(0).getCell(i).getBooleanCellValue());
//						break;
//					default:
//						System.out.println("Invalid Cell Type");
//					}
//				}
//			}
			System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
			workbook.close();
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
