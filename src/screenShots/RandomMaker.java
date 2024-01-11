package screenShots;

import net.bytebuddy.utility.RandomString;

public class RandomMaker {

	public static void main(String[] args) 
	{
		RandomString rs=new RandomString();
		
		System.out.println(rs.make(3));
		
		
	}

}
