class Room
{ 	int l=10;
	int b=20;
}

class area
{
	public static void main(String[] arg)
	{
		Room obj=new Room();
		int a=obj.l*obj.b;
		System.out.println("Area = "+a);
	}
}