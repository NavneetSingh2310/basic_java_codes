interface A
{
int x=100;
void display();
}

interface B
{
int x=100;
void display();
}

class Test_interface implements A,B
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String args[])
	{
		Test_interface t=new Test_interface();
		t.display();
		System.out.println("x = "+B.x);
	}
}
