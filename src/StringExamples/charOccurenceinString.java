package StringExamples;

import java.util.HashMap;

public class charOccurenceinString {

	public static void occurence(String str)
	{
		
		HashMap<Character,Integer> count= new HashMap<Character, Integer>();
		char[] ch= str.toCharArray();
		for(char c : ch)
		{
			if (count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else count.put(c, 1);
		}
		System.out.println(count);
		
	}
}
