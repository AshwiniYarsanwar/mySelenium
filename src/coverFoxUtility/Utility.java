package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.*;
import org.testng.Reporter;

public class Utility 
{
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		Reporter.log("Reading Data From Excel", true);
    	FileInputStream myFile=new FileInputStream("D:\\my document\\personal docu\\OneDrive\\Documents\\CoverFoxNew.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String data=mySheet.getRow(row).getCell(cell).getStringCellValue();
		
		return data;
		
	}
	public static void takeScreenshot(WebDriver driver,String TCID) throws IOException
	{
		Reporter.log("Taking Screenshot", true);
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\ashwi\\OneDrive\\Selenium ScreenShots\\coverFox"+TCID+"_"+timeStamp+".png");
	    Reporter.log("Saved Screenshot at"+dest, true);
	    org.openqa.selenium.io.FileHandler.copy(src, dest);
	
	
	}
}
