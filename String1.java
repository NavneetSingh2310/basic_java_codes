//WAP to compare
import java.util.Scanner;
import java.lang.*;
class String1
{
	public static void main(String srg[])
	{
		Scanner sc=new Scanner(System.in);
		String n[]=new String[5];
		
		for(int i=0;i<5;i++)
		{
			String str=sc.nextLine();
			n[i]=str;
			
		}
		
		for(int i=0;i<5-1;i++)
		{
			for(int j=0;j<5-i-1;j++)
			{
				if(n[j].compareTo(n[j+1])>0)
				{
					String temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
	}
	
	
	
}