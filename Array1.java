class Array1
{
	public static void main(String arg[])
	{
		int a[]={55,40,80,65,71};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
				
				
			}
		}
		for(int i=0;i<a.length-1;i++)
		System.out.println(a[i]);
		
		
	}
	
	
}