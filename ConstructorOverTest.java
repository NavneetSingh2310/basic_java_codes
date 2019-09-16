class ConstructorOver
{
	double w,h,d;
	ConstructorOver(double w,double h,double d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
		
	}
	ConstructorOver()
	{
		w=0.0d;
		h=0.0d;
		d=0.0d;
	}
	ConstructorOver(double len)
	{
		w=len;
		h=len;
		d=len;
	}
	
	double volume()
	{
		return w*h*d;
	}
}
class ConstructorOverTest
{
	public static void main(String args[])
	{
		
		ConstructorOver box1=new ConstructorOver(10,20,45);
		ConstructorOver box2=new ConstructorOver();
		ConstructorOver box3=new ConstructorOver(7);
		System.out.println(box1.volume());
		System.out.println(box2.volume());
		System.out.println(box3.volume());
	}
	
	
	
	}