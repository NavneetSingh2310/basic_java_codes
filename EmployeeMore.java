//WAP which includes three classes person employee and employeeMore(main class)
//person-----name,address,set(),show();
//employee----salary,set(),show();
import java.util.*;
class person
{
	String name,address;
	void set(String n,String a)
	{
		name=n;
		address=a;
	}
	
	void show()
	{
		System.out.println("Name = "+ name);
		System.out.println("Address = "+ address);
	}
	
}

class employee extends person
{
	int salary;
	void set(int s)
	{
       salary=s;		
	}
	
	void show()
	{  super.show();
		System.out.println("Salary = "+ salary);
	}
}

class EmployeeMore
{
	public static void main(String args[])
	{
		employee e =new employee();
        Scanner sc=new Scanner(System.in);
        e.set(900);
		e.set("Amit","Downtown");
		e.show();
		
	}
	
}