package miscellineousF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods {

	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException 
	{
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	  File dest=new File("C:\\Users\\ashwi\\OneDrive\\Selenium ScreenShots\\"+fileName+".png");
	  
	FileHandler.copy(src, dest);
	
	}
	public static void scrollIntoView(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		ImplicitWait(driver,10);
		js.executeScript("arguments[0].scrollIntoView", element);
			
	}
	public static void ImplicitWait(WebDriver driver, int time) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	public static String ReadDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException ,FileNotFoundException
	{
		FileInputStream myFile=new FileInputStream("D:\\my document\\personal docu\\Book23.xlsx");
	
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	
	   String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	 
	 return value;
	
	}
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//create object of properties file
		Properties prop=new Properties();
		//file location
		FileInputStream myFile=new FileInputStream("C:\\Users\\ashwi\\eclipse-workspace\\ashwiniSelenium\\AshuProperties.properties");
		
		//load file
		prop.load(myFile);
		String value = prop.getProperty(key);
		return key;
		
	}

}
