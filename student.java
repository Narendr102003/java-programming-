import java.io.*;
import java.util.*;
class student
{
public static void main(String args[])
{
char* N;
int R,m1,m2,m3,m4,m5;
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
N=s.nextLine();
System.out.println("enter regno:");
R=s.nextInt();
System.out.println("enter marks:");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
int m=m1+m2+m3+m4+m5;
float a=m/5;
System.out.println("name:"+N);
System.out.println("regno:"+R);
System.out.println("totalmarks:"+m);
System.out.println("avg marks:"+a);
}
}

