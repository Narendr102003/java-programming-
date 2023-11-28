import java.io.*;
import java.util.*;
class bill
{
int cno,cmr,lmr,unit;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter a customer number");
cno=s.nextInt();
System.out.println("enter a current month reading");
cmr=s.nextInt();
System.out.println("enter a last month reading");
lmr=s.nextInt();
System.out.println("enter a name");
String cname=s.nextLine();
unit=cmr-lmr;
}
void calculation()
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number 1-domestic ,2-industrial");
int x=s.nextInt();
switch(x)
{
case 1:
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
break;
case 2:
if(unit<=100)
{
System.out.println("bil amount "+unit*3);
}
else
if(unit >100&&unit<=300)
{
System.out.println("bill is "+(unit-100)*7.5+3*100);
}
else
if(unit>300&&unit<=500)
{
System.out.println("bill amount "+(unit-300)*10+100*3+200*7.5);
}
else
{
System.out.println("bill amount "+(unit-500)*12+7.5*200+3*100+200*10);
}
}

}
}
class electricity
{
public static void main(String args[])
{
bill a=new bill();
a.getdata();
a.calculation();
}
}

