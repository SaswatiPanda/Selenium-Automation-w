package javaProgramExample;

public class SecondRunnable implements Runnable {

	public void run()
	{
		System.out.println("Start of the 2nd thread");
		for(int i=0;i<3;i++)
		{
			System.out.println("Second thread is running " + i + " iteration");
			
		}
		System.out.println("End of 2nd thread");
	}
}
