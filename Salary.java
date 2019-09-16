//WAP to input a salary of a person through command line arguments (sal in double) calculate tax on sal 
//>50000 2.7%
//30000-50000 1.9%
//20000-30000 1.2%
//<20000 0%
import java.io.DataInputStream;
class Salary
{
	public static void main(String arg[])
	{
		//DataInputStream in=new DataInputStream(System.in);
		double num1=0.0d;
			//System.out.println("Enter an Integer");
		num1=Double.parseDouble(arg[0]);
		if(num1>=50000)
			System.out.println(num1+(0.027*num1));
		else if(num1>=30000 && num1<50000)
			System.out.println(num1+(0.019*num1));
		else if(num1>=20000 && num1<30000)
		System.out.println(num1+(0.012*num1));
		else
			System.out.println(num1);
	}
}