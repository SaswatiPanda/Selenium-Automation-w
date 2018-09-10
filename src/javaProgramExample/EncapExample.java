package javaProgramExample;

class EncapExample
{
	private static int a;
	private  int display(int  a)
	{
	this.a=a;
		return a;
	}
	public  int kuchu (int c, int d)
	{
		EncapExample.a= c+d;
		System.out.println("The result is " +a);
		return a;
	}
	
}