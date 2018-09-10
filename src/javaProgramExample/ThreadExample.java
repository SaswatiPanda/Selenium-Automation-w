package javaProgramExample;



public class ThreadExample {

	
	public static void main(String args[])
	{
		FirstThread fthread=  new FirstThread();
		SecondThread sthread= new SecondThread();
		fthread.setPriority(1);
		sthread.setPriority(5);
		fthread.start();
		sthread.start();
		
	}
}
