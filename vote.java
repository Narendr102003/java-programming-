import java.io.*;
import java.util.*;
class vote 
{
public static void main(String args[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("enter your age:");
age=s.nextInt();
if(age>=18)
{
System.out.println("you are eligible");
}
else
{
System.out.println("not eligible,your are eligible after "+(18-age)+" years");
}
}
}
