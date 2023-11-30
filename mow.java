import java.io.*;
import java.util.*;
class P
{
void display()
{
System.out.println("parent");
}
}
class C extends P 
{
void display()
{
System.out.println("child");
}
}
class mow
{
public static void main(String args[])
{
C c=new C();
c.display();
P p=new P();
p.display();
}
}
