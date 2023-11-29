import java.io.*;
import java.util.*;
class pattern 
{
int i,j,n;
void display()
{
Scanner s=new Scanner(System.in);
n=nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("1");
}
System.out.print("\n");
}
for(i=n-1;i>0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print("1");
}
System.out.print("\n");
}
}
class program
{
public static void main(String args[])
{
pattern a=new patten();
a.display();
}
}


