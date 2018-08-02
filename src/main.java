import java.util.*;

import service.EntityService;

import java.io.BufferedReader;//Scanner
import java.io.FileReader;


public class main 
{
	
	public static void main(String[]args) throws Exception
	{
		int i,j;
		//Scanner read=new Scanner(System.in);
		FileReader file=new FileReader("C:\\Users\\Agni_Hombali\\Desktop\\input.txt");
		BufferedReader reader=new BufferedReader(file);
		
		String text="";
		String line=reader.readLine();
		while(line!=null)
		{
			text=line;
			//text+=line;
			line=reader.readLine();
			//text=line;
			if(text.equals("car"))
			{
				EntityService obj1=new EntityService();
				obj1.vehicle1();
			}
			else if(text.equals("bus"))
			{
				EntityService obj2=new EntityService();
				obj2.vehicle2();
				
			}
			else if(text.equals("train"))
			{
				EntityService obj3=new EntityService();
				obj3.vehicle3();
			}
			else if(text.equals("plane"))
			{
				EntityService obj4=new EntityService();
				obj4.vehicle4();
				
			}
			
		}
	}
}
