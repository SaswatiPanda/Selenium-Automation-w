package javaProgramExample;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

class FileHandlingExample
{
	final boolean flag= false;
	
	public static void main (String args[]) throws IOException 
	{
		FileInputStream fr= new FileInputStream("C:\\FileHandlingExample\\Readfile.txt");
		FileOutputStream fw= new FileOutputStream("C:\\FileHandlingExample\\Writefile.txt");
		int ch;
		
		while ((ch= fr.read())!= -1)
{
	System.out.print((char)ch);
	fw.write((char)ch);
}
		fr.close();
		fw.close();
	}
}

