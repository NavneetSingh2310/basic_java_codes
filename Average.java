//WAP to input the average marks of the students through command line arguments and calculate the grade >=80 A....60-79 B...40-59 C.... <40 D
import java.io.DataInputStream;
class Average
{
	public static void main(String arg[])
	{
		//DataInputStream in=new DataInputStream(System.in);
		int num1=0;
			//System.out.println("Enter an Integer");
		num1=Integer.parseInt(arg[0]);
		if(num1>=80)
			System.out.println("A");
		else if(num1>=60 && num1<=79)
			System.out.println("B");
		else if(num1>=40 && num1<=59)
		System.out.println("C");
		else
			System.out.println("D");
	}
}