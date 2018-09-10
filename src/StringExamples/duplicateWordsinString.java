package StringExamples;

import java.util.HashMap;
import java.util.Set;



public class duplicateWordsinString {

	public static void duplicateWords(String str)
	{
		String[] words = str.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//checking for each word
		for(String word : words)
		{
			if (wordCount.containsKey(word.toLowerCase()))
			{
				System.out.print(wordCount.get(word.toLowerCase())+ " ");
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}
			else
				wordCount.put(word.toLowerCase(),1);
		}

		Set<String> wordInString = wordCount.keySet();
		for(String word : wordInString)
		{
			if(wordCount.get(word)>1)
			{
				System.out.println(word + ":" + wordCount.get(word));
			}
		}
	}
	
	
	
	
	
	
	
	}


