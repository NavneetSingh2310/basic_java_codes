//WAP to find out minimum value from array using the concept method overloading  aaray1 of type int array2 of type double array2 of type char
//make all the methods static

import java.util.Scanner;
import java.util.Arrays;
class Funover
{
	//private int a[]=new int[5];
	//private double b[]=new double[5];
	//private char c[]=new char[5];
	
	static int minfun(int a[])
	{ int min=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	 static double minfun(double b[])
	{ double min=b[0];
		for(int i=1;i<5;i++)
		{
			if(b[i]<min)
				min=b[i];
		}
		return min;
	}
	 static char minfun(char a[])
	{ char min=a[0];
		/*for(int i=1;i<5;i++)
		{
			if(a[i]<min)
				min=a[i];
		}*/
		Arrays.sort(a);
		return a[0];
	}
	
	public static void main(String args[])
	{
		int a[]=new int[5];
	   double b[]=new double[5];
	   char c[]=new char[5];
	   Scanner sc=new Scanner(System.in);
	   
	   for(int i=0;i<5;i++)
	   {
		   int aa=sc.nextInt();
		   a[i]=aa;
	   }
	   
	   for(int i=0;i<5;i++)
	   {
		   double bb=sc.nextDouble();
		   b[i]=bb;
	   }
	   
	   for(int i=0;i<5;i++)
	   {
		   char cc=sc.next().charAt(0);
		   c[i]=cc;
	   }
	   
	   System.out.println("INT = "+minfun(a));
	   System.out.println("DOUBLE = "+minfun(b));
	   System.out.println("CHAR = "+minfun(c));
		   
	}
	
}