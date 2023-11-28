import java.io.*;
import java.util.*;
class ari
{
int x,y;
ari()
{
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
x=s.nextInt();
y=s.nextInt();
System.out.println("sum of two numbers:"+(x+y));
System.out.println("diff of two numbers:"+(x-y));
System.out.println("multiply of two numbers:"+(x*y));
System.out.println("remainder of two numbers:"+(x%y));
System.out.println("quotient:"+(x/y));
}
}
class arithmeticc
{
public static void main(String args[])
{
ari a=new ari();

}
}
