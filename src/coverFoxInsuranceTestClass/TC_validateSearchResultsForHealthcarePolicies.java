package coverFoxInsuranceTestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_validateSearchResultsForHealthcarePolicies {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.coverfox.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        CoverFoxHomePagePOM home=new CoverFoxHomePagePOM(driver);
        home.femaleGenderButton();
        
        CoverFoxHealthPlanPagePOM healthplan=new CoverFoxHealthPlanPagePOM(driver);
        healthplan.nextButtonClick();
        
        CoverFoxHealthPlanMemberDeatilsPage memberDetails=new CoverFoxHealthPlanMemberDeatilsPage(driver);
	     memberDetails.ageDropdownSelect();
	     memberDetails.ClickOnNextButton();
	     
	     CoverFoxAddressDetailsPagePOM addressDetails=new CoverFoxAddressDetailsPagePOM(driver);
	     addressDetails.pinCodeField();
	     addressDetails.mobileNumField();
	     addressDetails.continueButtonClick();
	     
	     CoverFoxHealthPlanResultsPagePOM resultPage=new CoverFoxHealthPlanResultsPagePOM(driver);
	     resultPage.validatePlanListWithResults();
	     driver.close();
	
	
	}

}
