package javaProgramExample;

public class FirstRunnable implements Runnable {

	public void run()
	{
		System.out.println("Start of the 1st thread");
		for(int i=0; i<4;i++)
		{
			System.out.println("First thread is running" + i + "iteration");
			
		}
		System.out.println("End of the 1st thread");
	}
}
