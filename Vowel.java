//WAP to input a character using command line argumentand check wheather the char is vowel or not
class Vowel
{
	public static void main(String arg[])
	{ 
	char ch=arg[0].charAt(0);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':    { System.out.println(ch+": Vowel ");
			                             break;}
			default: {System.out.println("Not a vowel");}							 
		}
	}
	
	
}