package actionsClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//create object of FileInputStream
		Properties prop=new Properties();
		
		//create object of FileInputStream
		FileInputStream myFile=new FileInputStream("C:\\Users\\ashwi\\eclipse-workspace\\ashwiniSelenium\\AshuProperties.properties");
		
          prop.load(myFile);
         
         String value = prop.getProperty("PinCode");
	
          System.out.println(value);	
	}

}
