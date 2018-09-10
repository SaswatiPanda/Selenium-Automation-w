package StringExamples;

public class StringSpilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Day-Month-Year";
		String[] temp;
		String delimiter = "-";
		temp = str.split(delimiter);
		
		for(int i=0; i< temp.length; i++)
		{
			System.out.print(temp[i]+ " ");
			
		}
		
		

	}

}
