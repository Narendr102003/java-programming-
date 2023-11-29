import java.io.*;
import java.util.*;
class student
{
String sname;
int regno,m1,m2,m3,m4,m5,m;
float avg;
student(String name,int reg)
{
sname=name;
regno=reg;
System.out.println("student name="+sname);
System.out.println("registerno="+regno);
}
student(int a,int b,int c,int d,int e)
{
m1=a;
m2=b;
m3=c;
m4=d;
m5=e;
}
void calculate()
{
if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
{
m=m1+m2+m3+m4+m5;
avg=(float)m/5;
System.out.println("total marks="+m);
System.out.println("average="+avg);
}
}
void display()

{
if(m1>=35&&m2>=35&&m3>=35&&m4>=35&&m5>=35)
{
if(avg>=90)
{
System.out.println("the grade is A+");
}
else if(avg>=80&&avg<90)
{
System.out.println("the grade is A");
}
else if(avg>=70&&avg<80)
{
System.out.println("the garde is B");
}
else if(avg>=60&&avg<70)
{
System.out.println("the grade is C");
}
else
{
System.out.println("the grade is D");
}
}
else
{
System.out.println("you failed the subjct");
}
}
}
class report
{
public static void main(String args[])
{
student a=new student("narendra",1234);
student b=new student(45,32,90,67,56);
b.calculate();
b.display();
}
}


