package javaProgramExample;

public class PassbyRef {

	int var= 10;
	
	public void change(PassbyRef r)
	{
		r.var = r.var + 10;
	}


public static void main (String[] args)
{
	PassbyRef r=new PassbyRef();
	System.out.println("Before" + r.var);
	r.change(r); 
	System.out.println("After" + r.var);
	
}
}
