interface Animal
{
	//void eat();
	default public void eat()
	{
		System.out.println("Eats");
	}
	void travel();//public and abstract by default
}

public class Mammel implements Animal
{
	
	
		public void travel()
	{
		System.out.println("Travel");
	}
	
	public static void main(String arg[])
	{
		Animal m=new Mammel();
		m.eat();
		m.travel();
	}
} 