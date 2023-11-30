import java.io.*;
import java.util.*;
class F
{
int x=5;
void display()
{
System.out.println(x);
}
}
interface M
{
int y=10;
public void display1();
}
class C extends F implements M
{
public void display1()
{
System.out.println(y);
}
}
class multiplei
{
public static void main(String args[])
{
C c=new C();
c.display1();
c.display();
}
}
