package javaProgramExample;

import java.io.IOException;
import java.util.Scanner;

public class ArrayTranspose {

	public static void main(String args[]) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows and coloumns");
		// To accept rows and columns from the keyboard
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int arr[][]= new int[a][b];
		
		System.out.println("TPlease enter the value for the MAtrix");
		for(int i=0;i<a; i++)
			for(int j=0;j<b;j++)
				arr[i][j]=sc.nextInt();
	System.out.println("The  matrix is:");
		
		for(int i=0;i<a; i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(arr[i][j]+ " ");
	
			}
			System.out.println(" ");
	}
		
		System.out.println("The transpose matrix is:");
		
		for(int i=0;i<b; i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(arr[j][i]+ " ");
	
			}
			System.out.println(" ");
	}
}
}
