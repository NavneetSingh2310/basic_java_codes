/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


class GFG {
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char a[]=new char[40];
	char b[]=new char[40];
	char d[]=new char[40];
	int k=0,l=0,m=0;
	
	for(int i=0;i<s.length();i++)
	{
	    if(Character.isDigit(s.charAt(i)))
	    {
	        a[k++]=s.charAt(i);
	    }
	    
	    else if(Character.isAlphabetic(s.charAt(i)))
	    {
	        b[l++]=s.charAt(i);
	    }
	    else
	    d[m++]=s.charAt(i);
	}
	a[k]='\0';
	b[l]='\0';
	d[m]='\0';
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(d);
}
    
}