package StringExamples;

public class ReverseEachWordString {

	public static void reversal(String inputString) {
		// TODO Auto-generated method stub

		String[] words = inputString.split(" ");
		String reverseString = " ";
		for(int i=0; i< words.length; i++)
		{
			String word = words[i];
			String reverseWord = " ";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
				reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("The input string is : " + inputString);
		System.out.println("The reverse string is: " + reverseString);
		System.out.println("------------------------");
		
		
		
	}

}
