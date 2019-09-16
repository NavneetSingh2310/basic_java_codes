//WAP TO INPUT A CHAR THROUGH KEYBOARD AND CHECK IF IT IS ALPHA DIG OR SPECIAL SYMBOL
import java.io.DataInputStream;
class Alpha
{
	public static void main(String arg[])throws Exception
	{
		//DataInputStream in=new DataInputStream(System.in);
		char ch;
			System.out.println("Enter character");
		ch=(char)System.in.read();
	if(ch>='a'&&ch<='z'|| ch>='A'&& ch<='Z')
	{
		System.out.println("Alphabet");
		
	}
	
	else if(ch>='0'&&ch<='9')
		System.out.println("Digit");
	else
		System.out.println("Symbol");
	}
}