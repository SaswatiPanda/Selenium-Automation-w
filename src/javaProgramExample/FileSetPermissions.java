package javaProgramExample;

import java.io.File;

public class FileSetPermissions {

	public static void main(String args[])
	{
		File file = new File("C:\\Example\\Demo.txt");
		if(file.exists())
		{
			boolean result= file.setExecutable(true);
			System.out.println("Execute permission for owner is set or not? " + result);
		}
		else
		{
			System.out.println("Sorry, file does not exist");
		}
		if(file.exists())
		{
			boolean result= file.setExecutable(true, false);
			System.out.println("Execute permission for everyone is set or not? " + result);
			
		}
	}
}
