
//To Append Text To A File In Java Using FileWriter

package javaProgramExample;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void write(String s, File f) throws IOException
	{
		FileWriter fwrite= new FileWriter(f, true);
		
		fwrite.write(s);
		fwrite.close();
		
	}
	public static void main(String args[]) throws IOException
	{
		File f= new File("C:\\Example\\Append.txt");
		write("Micky", f);
		System.out.println("Done");
	}
}
