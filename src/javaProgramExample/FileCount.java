//To Find Number Of Characters, Words And Lines 

package javaProgramExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCount{

	public static void main(String args[]) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Example\\Demo.txt");
		file.read();
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		String ch= "";
		int c;
		while (( c=file.read())!=-1)
		{
			charCount++;	
				//char m=(char)c;
				//System.out.print(m);
				if(c==32)
					
				{
					wordCount=wordCount+1;
				}
				//System.out.println(s);
				if(c==46)
				{
					lineCount++;
					
				}
				
					
		}
		System.out.println(charCount+1);
		System.out.println(lineCount);
		System.out.println(wordCount+1);
	}
	
}