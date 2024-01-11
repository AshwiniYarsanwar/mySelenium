package frameworkPack;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateSwaglabLoginFunction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //create Object of POM class
        SwagLabloginPage login=new SwagLabloginPage(driver);
        
        login.enterUserName();
        login.enterPassword();
        login.clickOnLoginButton();
        
        SwagLabInventoryPage inventory=new SwagLabInventoryPage(driver);
        inventory.addBikeLiteToCart();
        inventory.addOnesieToCart();
        inventory.clickOnCartButton();
	}

}
