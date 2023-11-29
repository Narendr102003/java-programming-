import java.io.*;
import java.util.*;
class P
{
int x=10;
void display()
{
System.out.println("am having 10cr");
}
}
class C extends P
{
int y=10;
void display1()
{
System.out.println("i also having 10cr");
}
}
class single
{
public static void main(String args[])
{
C c=new C();
c.display1();
c.display();
}
}

