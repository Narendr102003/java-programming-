import java.io.*;
import java.util.*;
class add
{
int x,y;
add()
{
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
x=s.nextInt();
y=s.nextInt();
System.out.println("sum of two numbers:"+(x+y));
}
void display()
{
System.out.println("am not a constructor");
}
}
class sum
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
