import java.io.*;
import java.util.*;
class circle
{
int ar(int a)
{
return (int)(3.14*a*a);
}
float ar(float b)
{
return (float)(2*3.14*b);
}
}
class circlemol
{
public static void main(String args[])

{
circle m=new circle();
System.out.println(m.ar(10));
System.out.println(m.ar(4.5f));
}
}

