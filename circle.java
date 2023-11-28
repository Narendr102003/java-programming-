import java.io.*;
import java.util.*;
class area
{
float r;
double a,c;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter radius");
r=s.nextInt();
a=3.14*r*r;
c=2*3.14*r;
System.out.println("area of circle:"+a);
System.out.println("circumference:"+c);
}
}
class circle
{
public static void main(String args[])
{
area a=new area();
a.display();
}
}



