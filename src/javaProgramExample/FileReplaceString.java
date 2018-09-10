package javaProgramExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReplaceString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		modifyFile("C:\\Example\\Demo.txt", "puchu", "kuchu");
		System.out.println("The string is replaced");
		
	}
	
	public static void modifyFile(String f, String s1, String s2) throws IOException
	{
		Scanner sc= new Scanner (new File(f));
		while(sc.hasNextLine())
		{
							
			String content= sc.nextLine();
			String newContent= content.replaceAll(s1, s2);
			FileWriter fwrite= new FileWriter(f);
			fwrite.write(newContent);
			fwrite.close();
			}
			
			
			
		}
	}


