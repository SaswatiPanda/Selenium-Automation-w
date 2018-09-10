package javaProgramExample;

public class ClassA {

	
	
	
	public float add(int a, int b)
	{
		float c = a + b;
		System.out.println("The result is" + c);
		return c;
	}
	public float add(int a, int b, int d)
	{
		float c = a + b + d;
		System.out.println("The result is " + c + " This is operator overloading");
		return c;
	}
	public static float sub(int a, int b)
	{
		
		float c = a + b;
		System.out.println("The result is" + c);
		return c;
	}
	public static float div(int a, int b)
	{
		float c = a / b;
		System.out.println("The result is" + c);
		return c;
	}
	public static float mul(int a, int b)
	{
		float c = a * b;
		System.out.println("The result is" + c);
		return c;
	}
	public static void main(String[] args)
	{
		System.out.println(" " );
		
	}
}

