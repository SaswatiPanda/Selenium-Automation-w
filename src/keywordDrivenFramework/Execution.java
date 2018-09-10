package keywordDrivenFramework;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\Winy\\Documents\\keyworddrivenframework.xlsx";
		excelUtility.setexcel(path,0);
		for(int i = 0; i <=4; i++)
		{
			String keyword= excelUtility.getdata(i, 3);
			if(keyword.equals("openbrowser"))
			{
				ActionKeywords.openbrowser();
			}
			else if(keyword.equals("navigate"))
			{
				ActionKeywords.navigate();
			}
			else if(keyword.equals("credentials"))
			{
				ActionKeywords.credentials();
			}
			else if(keyword.equals("login"))
			{
				ActionKeywords.login();
			}
		}
		
	}

}
