import java.util.Scanner;
class Char
{
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		String str=sc.nextLine();
		int l=str.length();
		if(str.charAt(0)==str.charAt(l-1)&&str.charAt(1)==str.charAt(l-2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
		l=0;
		
	}}
	
}