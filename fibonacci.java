import java.io.*;
import java.util.*;
class fibonacci
{
public static void main(String args[])
{
int n,i,a=0,b=1,c,su=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
for(i=1;i<=n+2;i++)
{
System.out.print(a+" ");
if(a%2!=0)
{
su+=a;
}
c=a+b;
a=b;
b=c;
}
System.out.println("sum="+su);
}
}
