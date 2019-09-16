class ObjectAdd
{
private 	int d;
ObjectAdd(int d)
{
	this.d=d;
}
ObjectAdd()
{
	
}
static ObjectAdd sum(ObjectAdd a,ObjectAdd b)
{
ObjectAdd c=new ObjectAdd();
c.d=a.d+b.d;
return c;

}

public static void main(String args[])
{
	ObjectAdd a=new ObjectAdd(10);
	ObjectAdd b=new ObjectAdd(20);
	ObjectAdd c=new ObjectAdd();
	c=sum(a,b);
	System.out.println(c.d);
}

}