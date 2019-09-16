/*figure angle and rectangle three classes 
*/

import java.io.*;
class fig
{
    double d1,d2;
   fig(double d1,double d2) 
   {
       this.d1=d1;
       this.d2=d2;
   }
   
   void area()
   {
       System.out.println("Class Figure");
       //return 0;
   }
}

class triangle extends fig
{
    //double d1,d2;
   triangle(double d1,double d2)  
   { super(d1,d2);
   }
   
   void area()
   { double a=(0.5)*d1*d2;
       System.out.println(a);
       
   }
}
class rectangle extends fig
{
    //double d1,d2;
   rectangle(double d1,double d2) 
   {
       super(d1,d2);
      /* this.d1=d1;
       this.d2=d2;*/
   }
   
   void area()
   {
       double a=d1*d2;
       System.out.println(a);
   }
}



class Dispatch {
	public static void main (String[] args) {
		fig f=new fig(10,12);
		triangle t=new triangle(10,12);
		rectangle r=new rectangle(10,12);
		
		fig x;
		x=f;
		x.area();
		x=t;
		x.area();
		x=r;
		x.area();
		
	}
}