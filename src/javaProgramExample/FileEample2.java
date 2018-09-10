package javaProgramExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEample2 {

	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String ch= sc.nextLine();
		//System.out.println(sc.next());

		
	
		File f= new File("C:\\FileHandlingExample\\vicky.txt");
		f.createNewFile();
		
		FileOutputStream fout= new FileOutputStream("C:\\FileHandlingExample\\vicky.txt");
		int len=ch.length();
		int counter=0;
		
		while (counter< len)
		{
			char a= ch.charAt(counter);
			fout.write((char)a);
			counter++;
		}
		
		
	/*	for(int i=0;i<len; i++)
		{
			char a= ch.charAt(i);
			
					int n=(int)a;
			System.out.println(n);
			fout.write(a);
		}*/
		
	}
}
