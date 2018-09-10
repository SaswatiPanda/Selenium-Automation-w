package StringExamples;

import java.util.Arrays;

public class Anagram {

	public static void CheckAnagram(String s21, String s2)
	{
		String str1 = s21.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		
		boolean status= true;
		if(str1.length()!= str2.length())
		{
			System.out.println("Not an anagram");
			status = false;
		}
		else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
		}
		if(status)
		{
			System.out.println(s21+ " and " +s2 + " are anagrams.");
		}
			
	}
}