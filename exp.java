import java.io.*;
import java.util.*;
import java.lang.Math;
class exp
{
public static void main(String args[])
{
int x1,x2,y1,y2;
Scanner s=new Scanner(System.in);
x1=s.nextInt();
x2=s.nextInt();
y1=s.nextInt();
y2=s.nextInt();
int M=(int) Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
System.out.println(M);
}
}

