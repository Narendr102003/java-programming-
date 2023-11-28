import java.io.*;
import java.util.*;
class add
{
int x,y;
add()
{
x=0;
y=0;
}
add(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println("sum="+(x+y));
}
}
class s
{
public static void main(String args[])
{
add a=new add(10,20);
a.display();
add b=new add(30,40);
b.display();
}
}

