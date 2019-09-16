//WAP to input a char AND CONVERT THE CHAR IN UPPERCASE IS IT IS IN LOWER CASE.iNPUT PROVIDED THROUGH KEYBOARD
import java.io.DataInputStream;
class upper
{
	public static void main(String arg[])throws Exception
	{
		//DataInputStream in=new DataInputStream(System.in);
		char ch;
			System.out.println("Enter character");
		ch=(char)System.in.read();
	if(ch>='a'&&ch<='z')
	{
		ch-=32;
	System.out.println(ch);
	}
else System.out.println("Already in upper case");
	}
}
