package StringExamples;

import java.util.Scanner;

public class CountWordsinString {
	
	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count =1;
		for(int i=0; i<str.length(); i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!= ' '))
{
	count++;
}
			
		}
		System.out.println("Number of words in a string =" +count);
	}

}
