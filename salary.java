import java.io.*;
import java.util.*;
class salary
{
public static void main(String args[])
{
double bs,tax,asalary,homeloan,lic,hra,da,ta,ca,pf,gs,ded,ns,b;
int empno;
String empname,designtation;
Scanner e=new Scanner(System.in);
System.out.println("enter name");
empname=e.nextLine();
System.out.println("employee no=");
empno=e.nextInt();
System.out.println("enter basic salary=");
bs=e.nextFloat();
System.out.println("enter homeloan=");
homeloan=e.nextFloat();
System.out.println("enter lic=");
lic=e.nextFloat();
hra=bs*0.2;
da=bs*0.2;
ta=bs;
ca=bs*0.05;
pf=bs*0.12;
gs=bs+hra+da+ta+ca;
ded=pf+homeloan+lic;
ns=gs-ded;
System.out.println("empno="+empno);
System.out.println("empname="+empname);
System.out.println("basic salary="+bs);
System.out.println("hra="+hra);
System.out.println("da="+da);
System.out.println("ta="+ta);
System.out.println("ca="+ca);
System.out.println("pf="+pf);
System.out.println("homeloan="+homeloan);
System.out.println("lic="+lic);
System.out.println("gross="+gs);
System.out.println("deduction="+ded);
System.out.println("net salary="+ns);


if(ns<10000)
{
b=ns*0.05;
System.out.println("bonus="+b);
}
else
if(ns>10000&&ns<30000)
{
b=ns*0.1;
System.out.println("bonus="+b);
}
else if(ns>30000&&ns<50000)
{
b=ns*0.2;
System.out.println("bonus="+b);
}
else
{
b=ns*0.3;
System.out.println("bonus="+b);
}
asalary=ns*12;
if(asalary<250000)
{
System.out.println("no income tax applied");
}
else
if(asalary>250000&&asalary<500000)
{
tax=ns*0.05;
System.out.println("income tax="+tax);
}
else
if(asalary>500000&&asalary<750000)
{
tax=ns*0.1;
System.out.println("income tax="+tax);
}
else
if(asalary>750000&&asalary<1000000)
{
tax=ns*0.15;
System.out.println("income tax="+tax);
}
else
{
tax=ns*0.2;
System.out.println("income tax="+tax);
}

}
}


