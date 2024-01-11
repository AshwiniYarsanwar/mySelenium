package coverFoxInsuranceTestClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanResultsPagePOM 
{

	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")private WebElement resultsInString;
	@FindBy(id = "plans-list")private List<WebElement> planList;
	public CoverFoxHealthPlanResultsPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validatePlanListWithResults()
	{
		String test=resultsInString.getText();
		//49 matching "Health""Insurance""Plans"
		
		String ar[]=test.split(" ");
		// ar[]= {"49""matching""Health""Insurance""Plans"}
	
		String numberOfResultsInString=ar[0];//49-->String
		//convert String to Integer
		int numberOfResultsInInt=Integer.parseInt(numberOfResultsInString);//49-->innumber(int)
		
		int totalNumberOfPlans=planList.size();
		
		if(totalNumberOfPlans==numberOfResultsInInt)
		{
			System.out.println("Plans number matching with plans List,TC is passed");
		}
		else {
			System.out.println("Plans number is not matching with plans List,TC is failed");
		}
	}
}
