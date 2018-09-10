package javaProgramExample;

public class StringExample {
	
	public static void main(String args[])
	
	{
		String s1= "winnie";
		String s2= "vicky";
		String s3= "winnie";
		String s4= new String("miki");
		String s5= new String("miki");
		String s6= new String("raju");
		/*System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));*/
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
	}
	
}
