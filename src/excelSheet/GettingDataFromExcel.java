package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GettingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\ashwi\\OneDrive\\Documents\\Book1.xlsx");
	
	     Workbook myWorkbook = WorkbookFactory.create(myFile);
	
	     System.out.println(myWorkbook);
	     
	    Sheet mySheet = myWorkbook.getSheet("Sheet1");
	     
	   int lastRowNum = mySheet.getLastRowNum();
	   
	   int totalNumOfRows=lastRowNum ;
	   
	   System.out.println(totalNumOfRows);
	   
	   short lastCellNum=mySheet.getRow(0).getLastCellNum();
	   
	   int totalNumOfCells=lastCellNum-1;
	   
	   //outer for loop-->cells
	   
	   for(int i=0;i<=totalNumOfCells;i++)
	   {
		   //inner for loop-->cells
		   for(int j=0;j<=totalNumOfCells;j++)
		   {
		  String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		   System.out.println(value+" ");
	   }
	   System.out.println();
	   }
	   
	   
	   
	   
	   
	}

}
