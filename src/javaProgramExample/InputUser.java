package javaProgramExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUser{

	public static void main(String[] args){
		try {
		String input=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		input=sc.nextLine();
		int a=sc.nextInt();
		float f= sc.nextFloat();
				System.out.println(input);
		System.out.println(a);
		sc.close();
		}
		catch (Exception e) {
		
		System.out.println(e);
		System.out.println("Exception");
			
		}
	}
		public void opne() throws IOException {
		File f=new File("C:\\Selenium Jar\\read.txt");
		f.createNewFile();
		
		// TODO Auto-generated method stub

	}

}
