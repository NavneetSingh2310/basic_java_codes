class StudentData
{
	private int id;
	private String name;
	private int age;
	
	StudentData()
	{
		/*id=0;
		name="NULL";
		age=0;*/
	}
	
	StudentData(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	String getname()
	{
		//String str=" ";
		//System.out.println(name);
		return name;
	}
	
	int getage()
	{
		return age;
	}
	
	int getid()
	{
		return id;
	}
	public static void main(String arg[])
	{
		StudentData myobj=new StudentData();
		System.out.println("Name      "+myobj.getname());
		System.out.println("Age         "+myobj.getage());
		System.out.println("ID           "+myobj.getid());
		StudentData myobj2=new StudentData(555,"ABC",25);
		System.out.println("Name        "+myobj2.getname());
		System.out.println("Age         "+myobj2.getage());
		System.out.println("ID            "+myobj2.getid());
	}
}