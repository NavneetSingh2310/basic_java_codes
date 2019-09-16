import java.io.DataInputStream;
class Datainput
{
	public static void main(String arg[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int num1=0;
		
		float num2=0.0f;
		try{
			System.out.println("Enter an Integer");
		num1=Integer.parseInt(in.readLine());
		System.out.println("Enter a float value");
		num2=Float.valueOf(in.readLine()).floatValue();
		}
		catch(Exception e){}
	System.out.println("1st Number = "+ num1);
	System.out.println("2st Number = "+ num2);
	}
}
