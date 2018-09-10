package javaProgramExample;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main (String args[])
	{
		TreeSet<String> set= new TreeSet<String>();
		set.add("12");
		set.add("22");
		set.add("11");
		set.add("11");
		System.out.println(set);
	}
}
