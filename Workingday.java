import java.io.*;
import java.lang.*;
class Workingday
{
public static void main(String args[])
{
try
{
int j=0;
String[] s={"monday","tuesday","wednesday","thursday","friday","saturday"};
String day;
DataInputStream in=new DataInputStream(System.in);
day=in.readLine();
if(day.equals("sunday"))
{
System.out.println("False");
}
else
{
for(int i=0;i<6;i++)
{
if(s[j].equals(day))
{
System.out.println("True");
break;
}
else
{
j++;
}
}
}
}
catch(Exception e)
{
}
}
}
