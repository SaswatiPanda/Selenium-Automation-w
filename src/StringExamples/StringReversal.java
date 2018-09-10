package StringExamples;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Soumya Darshan Mishra";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		
		for(int i = ch.length-1; i>=0; i--)
			System.out.print(ch[i]);
		
	}

}
