package miscellineousF;

import java.io.IOException;

public class CommonlyUsedPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		String value1 = CommonlyUsedMethods.readDataFromPropertyFile("CityName");
		
        System.out.println(value1);
     
        String value2 = CommonlyUsedMethods.readDataFromPropertyFile("Name");
        
        System.out.println(value2);
        
        
	}

}
