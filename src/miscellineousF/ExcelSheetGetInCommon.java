package miscellineousF;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetGetInCommon 
{
   public static void main(String[]args) throws EncryptedDocumentException, FileNotFoundException, IOException
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");
       CommonlyUsedMethods.ImplicitWait(driver, 5);
       
       WebElement fullName = driver.findElement(By.id("usernameField"));
   
       WebElement password = driver.findElement(By.id("passwordField"));
       
       WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Login']"));
   
        fullName.sendKeys(CommonlyUsedMethods.ReadDataFromExcel(4, 0));
        
        password.sendKeys(CommonlyUsedMethods.ReadDataFromExcel(5, 2));
   
       clickbutton.click();
   }
}
