package redinfromarray;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class a2drray {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath = new File("./resources/data.xls");
		FileInputStream fis = new FileInputStream(abspath);
		Workbook workbook = WorkbookFactory.create(fis);
		int rowcount = workbook.getSheet("sheet3").getPhysicalNumberOfRows();
		int cellcount = workbook.getSheet("sheet3").getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowcount);
		System.out.println(cellcount);

		String[][] arr = new String[rowcount][cellcount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				arr[i][j] = workbook.getSheet("Sheet3").getRow(i).getCell(j).toString();
				System.out.println(arr[i][j]);
			}
		}

	}
}
