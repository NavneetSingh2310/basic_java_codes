import java.io.*;
class FileExample1
{
public static void main(String args[]) throws IOException
{
File f1=new File("c:/javapr/name1.txt");
f1.createNewFile();
System.out.println("Exists"+f1.exists());
System.out.println("Write"+f1.canWrite());
System.out.println("Name"+f1.getName());
System.out.println("length"+f1.length());
}
}