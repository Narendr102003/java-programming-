import java.io.*;
import java.util.*;
class bill
{
int cmr,lmr,cno,unit;
String cname;
bill(int no,String name)
{
cname=name;
cno=no;
System.out.println("name="+cname);
System.out.println("number="+cno);
}
bill(int cr,int lr)
{
cmr=cr;
lmr=lr;
unit=cmr-lmr;
}
void calculate()
{
if(unit<=100)
{
System.out.println("free cost");
}
else
if(unit >100&&unit<=300)
{
System.out.println("bill is "+(unit-100)*3);
}
else
if(unit>300&&unit<=500)
{
System.out.println("bill amount "+(unit-300)*7.5+200*3);
}
else
{
System.out.println("bill amount "+(unit-500)*10+7.5*200+3*200);
}
}
}
class electric
{
public static void main(String args[])
{
bill a=new bill(1234,"narendra");
bill b=new bill(450,200);
b.calculate();
}
}

