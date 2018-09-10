package javaProgramExample;

public class Exceptionexample {

	public static void main (String args[])
	{
		try {
			
			int n=0;
			int a= 10/0;
			System.out.println(a);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Close Files");
		}
		
	}
}
