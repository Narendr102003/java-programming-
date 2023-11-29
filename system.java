import java.io.*;
import java.util.*;
class college
{
void display()
{
System.out.println("college name is SAVEETHA");
}
}
class student extends college
{
void display1()
{
System.out.println("st_id=192210319");
System.out.println("st_name=nare");
}
}
class staff extends college
{
void display2()
{
System.out.println("stf_id=1234");
System.out.println("stf_name=sure");
}}
class office extends college
{
void display3()
{
String clrk="surya";
System.out.println("clerk_name="+clrk);
}
}
class teaching extends staff
{
void display4()
{
String dept="CSE";
System.out.println("dept_name="+dept);
}
}
class nts extends staff
{
void display5()
{
String p="regular";
System.out.println("regular or parttime ="+p);
}
}
class salary extends teaching
{
void display6()
{
int pay=20000;
System.out.println("pay="+pay);
}
}
class wages extends teaching
{
void display7()
{
int pay=500;
System.out.println("pay/day="+pay);
}
}
class system
{
public static void main(String args[])
{
student a=new student();
a.display();
a.display1();
office b=new office();
b.display3();
nts c=new nts();
c.display2();
c.display5();
salary d=new salary();
d.display4();
d.display6();
wages e=new wages();
e.display7();
}
}
