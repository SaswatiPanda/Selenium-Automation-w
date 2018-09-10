package javaProgramExample;

public class ClassB extends ClassA {

	
public static void display()
{
	System.out.println("This is the child class");
}

public static float sub(int a, int b)
{
	float c = a - b;
	System.out.println("The result is" + c);
	return c;
}
public static void main(String[] args)
{
	ClassB obj= new ClassB();
	
	obj.sub(7, 9);
			
	
}
}
