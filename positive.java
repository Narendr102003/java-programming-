import java.io.*;
import java.util.*;
class positive
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
num=s.nextInt();
if(num>0)
{
System.out.println("number is positive");
}
else
{
System.out.println("number is negative,the number become positive to add "+(-(num)+1));
}
}
}
