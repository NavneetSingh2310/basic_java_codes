import java.util.Scanner;
class TestClass
{
	private int var1=10;
	public int var2;
	private void method1()
	{
		System.out.println("I am private to this class");
		
	}
	public void method2()
	{
		System.out.println("I am public to this class");
		
	}
	public void accessPrivate()
	{
		System.out.println("Private variable = "+var1);
		method1();
	}
}

public class AccessDemo
{
    public static void main(String args[])
	{
		TestClass ob=new TestClass();
		ob.var2=100;
		System.out.println(ob.var2);
		ob.method2();
		//ob.var1=200;
		//ob.method1();
		ob.accessPrivate();
	}
}