package coverFoxInsuranceTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePagePOM 
{
  @FindBy(xpath = "//div[@class='w--radio__option radio_selected']")private WebElement femaleGenderSelection;
  @FindBy(xpath = "//input[@type='tel']")private WebElement mobileNumField;
  @FindBy(xpath = "//button[text()='Get Started']")private WebElement startButton;
  
  public CoverFoxHomePagePOM(WebDriver driver)
  {
	 PageFactory.initElements(driver, this); 
  }
  public void femaleGenderButton()
  {
	 femaleGenderSelection.click(); 
  }
  public void mobileNumField() 
  {
	  mobileNumField.sendKeys("9049824656");
  }
  public void startButtonField()
  {
	  startButton.click();
  }
}
