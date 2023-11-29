import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{
int n,i,j,d=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("1 ");
}
System.out.print("\n");
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("1 ");
}
System.out.print("\n");
}
}
}
