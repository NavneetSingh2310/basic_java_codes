//WAP to create a class employee.
//the employee class has 4 instance variables name=, age, designation and salary
//the class has one explicit defined constructor which takes a parameter name 
//write an another class employee test which creates two instances of the class emp and invokes the method for each object to assign values
//for each variables. main method will be included in eptest class
 import java.util.Scanner;
 class emp{
	 
	  String name;
	  int age;
	  String desig;
	  double salary;
	  public emp(String name)
	  {
		  this.name=name;
		  
	  }
	  
	  public void empage(int a)
	  {
		  age=a;
	  }
	  public void empdesig(String d)
	  {
		  desig=d;
	  }
	  public void empsal(double s)
	  {
		  salary=s;
	  }
	  public void printEmp()
	  {
		  System.out.println(name);
		  System.out.println(age);
		  System.out.println(desig);
		  System.out.println(salary);
	  }
	 
 }
 
 class emptest
 {
	 public static void main(String arg[])
	 {
	 emp ob=new emp("Amit");
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 sc.nextLine();
	 String d=sc.nextLine();
	 double s=sc.nextDouble();
	 ob.empage(a);
	 ob.empdesig(d);
	 ob.empsal(s);
	 ob.printEmp();
	 }
 }