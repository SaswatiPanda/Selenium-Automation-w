package javaProgramExample;

public class Absexample extends AbstractExample {

	public static void main (String[] args)
	{
		AbstractExample obj = new AbstractExample();
		obj.method1();
		obj.method2();
		ClassAbstract obj1= new ClassAbstract()
		{
			
			@Override
			void method1() {
				// TODO Auto-generated method stub
				System.out.println("This is a new implementation");
				
			}

		};
		obj1.method1();
}
}
