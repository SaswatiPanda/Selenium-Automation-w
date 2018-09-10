package javaProgramExample;

import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOccurences {
	
	public static void countOccurrences(String s, Map<String,Integer> words) throws IOException
	{
		Scanner scWrite= new Scanner(new File(s));
		while(scWrite.hasNext())
		{
			String word= scWrite.next();
			Integer count = words.get(word);
			if(count!=null)
			
				count++;
				else
					count=1;
			words.put(word, count);
			
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
		Map<String, Integer> words= new HashMap<String, Integer>();
		countOccurrences("C:\\Example\\Occurences.txt", words);
		System.out.println(words);
	}

}
