import java.io.*;
import java.util.*;
class F
{
void display()
{
System.out.println("father");
}
}
interface M1
{
public void display1();
}
interface M2
{
public void display2();
}
class C extends F implements M1,M2
{
public void display1()
{
System.out.println("first mother");
}
public void display2()
{
System.out.println("second mother");
}
}
class multipleexp
{
public static void main(String args[])
{
C c=new C();
c.display();
c.display1();
c.display2();
}
}
