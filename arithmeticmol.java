import java.io.*;
import java.util.*;
class arithmetic
{
int ari(int a,int b)
{
return a+b;
}

float ari(int c,float d)
{
return c-d;
}
float ari(float e,int f)
{
return e*f;
}
float ari(float g,float h)
{
return g/h;
}
double ari(double i,int j)
{
return j%i;
}
}
class arithmeticmol
{
public static void main(String args[])
{
arithmetic  ex=new arithmetic();
System.out.println(ex.ari(10,6));
System.out.println(ex.ari(6,3.4f));
System.out.println(ex.ari(3.2f,4));
System.out.println(ex.ari(5.0f,2.5f));
System.out.println(ex.ari(2.44,2));
}
}
