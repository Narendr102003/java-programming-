import java.io.*;
import java.util.*;
class area
{
public static void main(String args[])
{
float r,a;
Scanner s=new Scanner(System.in);
System.out.println("enter radius:");
r=s.nextFloat();
System.out.println("enter side:");
a=s.nextFloat();
double PI=3.14;
double ac=PI*r*r;
float as=a*a;
System.out.println("area of circle:"+ac+"area of square"+as);
}
}

