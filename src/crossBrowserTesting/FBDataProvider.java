package crossBrowserTesting;

import org.testng.annotations.DataProvider;

public class FBDataProvider {
  
  
	  //method-->dataProvider
	  //String firstName,String lastName,String MobNum
	  @DataProvider(name="FBRegression")
	  public static String[][]fbDataSet()
	  {
		  String data[][]= {{"Ashwini","Yarsanwar","9999999999"},{"Kshitija","Yarsanwar","8888779900"}};
	      return data;
	  }
	 @DataProvider(name="FBSanity")
	 public static String[][]fbDataSet1()
	 {
		 String data[][]= {{"ABC","XYZ","0099887766"},{"PQR","JKL","8877665544"}};
		 return data;
		 }
	 }
		
	                        
  

