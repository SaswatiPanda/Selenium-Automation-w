package javaProgramExample;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String args[])
	{
		LinkedHashSet<String> link= new LinkedHashSet<>();
		link.add("You are my LOVE");
		link.add("You are my LOVE");
		link.add("Yes");
		link.add("Peach");
		link.add("Orange");
		link.add("Mango");
		link.remove("Peach");
		
		System.out.println(link);
	}
}
