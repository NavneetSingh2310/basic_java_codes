import java.util.Scanner;
class ScannerDemo
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Gender");
		char g=sc.next().charAt(0);
		System.out.println("Age");
		int age=sc.nextInt();
		System.out.println("Mobile");
		long mob=sc.nextLong();
		System.out.println("Cgpa");
		double cgpa=sc.nextDouble();
		System.out.println(name+"\n"+g+"\n"+age+"\n"+mob+"\n"+cgpa);
		
		
		
	}
	
}