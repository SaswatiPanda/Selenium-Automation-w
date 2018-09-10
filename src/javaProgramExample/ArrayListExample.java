package javaProgramExample;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public void CreateArray()
	{
		List l1= new ArrayList<>();
		
		l1.add("Soumya");
		l1.add("Winnie");
		//System.out.println("The elements of the list are" + l1);
		//System.out.println(l1.size());
		l1.remove(1);
		//System.out.println(l1);
		l1.add("Micky");
		l1.add("Raju");
		l1.add(0, "Winnie");
		//System.out.println(l1);
		l1.remove(1);
		//System.out.println(l1);
		List l2= new ArrayList<>();
		l2.add("Puchu");
		l2.addAll(l1);
		//System.out.println(l2);
		//System.out.println(l2.contains(l1));
		//System.out.println(l2.contains("Puchu"));
		l1.add(0, "puchu");
		System.out.println(l1);
		System.out.println(l2);
		//l2.retainAll(l1);
		//System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		l2.add("Soumya");
		l2.add("Soumya");
		l2.add("Soumya");
		System.out.println(l2);
		
		
		
		
		
	}
	
}
