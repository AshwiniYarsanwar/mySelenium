package coverFoxInsuranceTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPagePOM 
{
   @FindBy(xpath = "//div[contains(text(),'Next')]")private WebElement nextButton;
   
   public CoverFoxHealthPlanPagePOM(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);
   }
   
   public  void nextButtonClick()
   {
	   nextButton.click();
   }
}
