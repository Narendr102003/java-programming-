import java.io.*;
import java.util.*;
class read
{
public static void main(String args[])
{
int a[]=new int[10];
int i,n,t,max,min,j,m,k;
Scanner s=new Scanner(System.in);
System.out.println("enter limit of index");
k=s.nextInt();
System.out.println("enter value of n:");
n=s.nextInt();
System.out.println("enter value of m:");
m=s.nextInt();
System.out.println("enter input elements:");
for(i=1;i<=k;i++)
{
a[i]=s.nextInt();
}
for(i=1;i<=k;i++)
{
for(j=i+1;j<=k;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("sorted elements:");
for(i=1;i<=k;i++)
{
System.out.println(a[i]);
}
max=a[m];
min=a[k-n+1];
System.out.println("mth maximum is :"+max);
System.out.println("nth minimum is :"+min);
System.out.println("sum="+(max+min));
System.out.println("diff="+(max-min));
}}


