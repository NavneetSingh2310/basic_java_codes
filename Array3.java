import java.util.Scanner;
class Array3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int aa=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				aa=sc.nextInt();
				a[i][j]=aa;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				aa=sc.nextInt();
				b[i][j]=aa;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}