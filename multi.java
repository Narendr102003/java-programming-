import java.io.*;
import java.util.*;
class GP
{
int x=10;
void display()
{
System.out.println("am having 10cr="+x);
}
}
class P extends GP
{
int y=10;
void display1()
{
System.out.println("i also having 10cr="+y);
}
}
class C extends P
{
int z=10;
void display2()
{
System.out.println("z="+z);
}
}
class multi
{
public static void main(String args[])
{
C c=new C();
c.display2();
c.display1();
c.display();
}
}
