import java.io.*;
import java.util.*;
class student
{
void display()
{
System.out.println("student name=narendra");
}
}
class testmarks extends student
{
void display1()
{
int m1=78;
int m2=89;
System.out.println("m1="+m1+"\nm2="+m2);
}
}
interface sports
{
public void display2();
}
class result extends testmarks implements sports
{
public void display2()
{
System.out.println("sports marks=89");
}
void display3()
{
System.out.println("garde is B");
}
}
class hyb
{
public static void main(String args[])
{
result c=new result();
c.display();
c.display1();
c.display2();
}
}

