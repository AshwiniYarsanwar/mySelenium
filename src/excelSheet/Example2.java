package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\my document\\personal docu\\Book2.xlsx");
		
		Workbook myWorkbook = WorkbookFactory.create(myFile);

		Sheet mySheet = myWorkbook.getSheet("Sheet1");
	
		int lastRowNum = mySheet.getLastRowNum();
	
		int totalNumOfRows = lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();

	     int totalNumOfCell = lastCellNum-1;
	     
	     //outer for loop
	     for(int i=0;i<=totalNumOfRows;i++)
	     {   //inner for Loop
	    	 for(int j=0;j<=totalNumOfCell;j++)
	    	 {
	    		CellType myCellDataType = mySheet.getRow(i).getCell(j).getCellType(); 
	    	 
	    	     //System.out.println(myCellDataType);
	    	   if(myCellDataType==CellType.STRING)
	    	   {
	    		   String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		   
	    		   System.out.print(value+" ");
	    	   }
	    	   else if(myCellDataType==CellType.BOOLEAN)
	    	   {
	    		   boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
	    	  
	    		   System.out.print(value+" ");
	    	   
	    	   }
	    	   else if(myCellDataType==CellType.NUMERIC)
	    	   {
	    		   double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
	    		   
	    		   System.out.print(value+" ");
	    	   }
	    	 }
	    	 System.out.println();
	     }
	
	
	
	}
	

}
