package StringExamples;

public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Stay Calm & Study";
		int index = str.indexOf("&");
		
		if(index == -1)
		{
			System.out.println("String not found");
		}
		else
			System.out.println("Found string at :" +index);
	}

}
