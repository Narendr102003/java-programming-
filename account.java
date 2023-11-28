import java.io.*;
import java.util.*;
class bankaccount
{
int customerno,ia,ta;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter customer no");
customerno=s.nextInt();
System.out.println("enter initial amount of bank");
ia=s.nextInt();
ta=ta+ia;
}
void deposit()
{
Scanner s=new Scanner(System.in);
System.out.println("enter deposit amount");
int da=s.nextInt();
ta=ta+da;
}
void withdrawn()
{
Scanner s=new Scanner(System.in);
System.out.println("enter withdrawnamount");
int wa=s.nextInt();
if(ta<wa)
{
System.out.println("insufficient balance");
}
else
{
ta=ta-wa;
}
}
void balance()
{
System.out.println("balance="+ta);
}
}
class account
{
public static void main(String args[])
{
bankaccount a=new bankaccount();
a.getdata();
a.deposit();
a.withdrawn();
a.balance();
}
}
