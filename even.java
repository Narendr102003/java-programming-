import java.io.*;
import java.util.*;
class even
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
num=s.nextInt();
if(num%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd,the number become even to add "+(num%2));
}
}
}
