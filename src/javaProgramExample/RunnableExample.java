package javaProgramExample;

public class RunnableExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FirstRunnable frun = new FirstRunnable();
		SecondRunnable srun= new SecondRunnable();
		
		Thread t= new Thread(frun);
		t.start();
		t.setPriority(5);
		System.out.println("The name is " + t.getName());
		System.out.println("The priority is " + t.getPriority());
		Thread t2= new Thread(srun);
		t2.setDaemon(true);
		t2.start();
		
		System.out.println("The name is " + t2.getName());
	}

}
