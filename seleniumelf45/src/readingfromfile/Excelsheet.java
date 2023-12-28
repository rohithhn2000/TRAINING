package readingfromfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, NoSuchFileException {
		File abspath=new File("./resources/data.xls");
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook=WorkbookFactory.create(fis);
		String Data1=workbook.getSheet("data").getRow(0).getCell(0).getStringCellValue();
		double Data2=workbook.getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
		boolean Data3=workbook.getSheet("sheet2").getRow(0).getCell(0).getBooleanCellValue();
		LocalDateTime Data4=workbook.getSheet("sheet3").getRow(5).getCell(3).getLocalDateTimeCellValue();
		System.out.println(Data1);
		System.out.println(Data2);
		System.out.println(Data3);
		System.out.println(Data4);

		
	}

}
