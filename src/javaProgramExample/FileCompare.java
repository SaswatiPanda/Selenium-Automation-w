package javaProgramExample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCompare {
	
	public static void main(String args[]) throws IOException
	{
		compareFiles("C:\\Example\\Demo.txt", "C:\\Example\\Demo1.txt");
		System.out.println("Files are compared");
	}

	public static void compareFiles(String s1, String s2) throws IOException
	{
		Scanner sc1= new Scanner(new File(s1));
		Scanner sc2= new Scanner(new File(s2));
		
		while(sc1.hasNextLine() && sc2.hasNextLine())
		{
			String content= sc1.nextLine();
			String content1= sc2.nextLine();
			if (content.equals(content1))
			{
				
				System.out.println("Files have same content");
			}
			else
				
				System.out.println("Files do not have same content");
		}
		sc1.close();
		sc2.close();
		
		
	}
	 
}
