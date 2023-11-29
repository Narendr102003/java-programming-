import java.io.*;
import java.util.*;
class P
{
int x=9;
void display()
{
System.out.println("am having ="+x);
}
}
class C1 extends P
{
int y=3;
void display1()
{
System.out.println("i also having ="+y);
}
}
class C2 extends P
{
int z=3;
void display2()
{
System.out.println("am having"+z);
}
}
class C3 extends P
{
int m=3;
void display3()
{
System.out.println("am having "+m);
}
}
class hierarichel
{
public static void main(String args[])
{
C3 c3=new C3();
c3.display3();
c3.display();
C2 c2=new C2();
c2.display2();
C1 c1=new C1();
c1.display1();
}
}
