package javaProgramExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 

public class FileSorting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> words= readFromFile("C:\\Example\\Sorting.txt");
		System.out.println(words);
		Collections.sort(words);
		System.out.println(words);
	}

	
	
	public static ArrayList readFromFile(String s) throws IOException
	{
		ArrayList<String> myList= new ArrayList<String>();
		Scanner sc= new Scanner(new File (s));
		while (sc.hasNextLine())
		{
			myList.add(sc.nextLine());
			
		}
		sc.close();
		return myList;
	}
	
}
