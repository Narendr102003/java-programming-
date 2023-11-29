import java.io.*;
class numbers
{
public static void main(String args[])
{
int m=100,n=200,count,i;
for(m=100;m<n;i++)
{
count=0;
for(i=1;i<=m;i++)
{
if(m%i==0)
{
count++;
}
}
if(count==2)
{
System.out.print(m+" ");
}
else
{
System.out.print(m+" ");
}
}
}
}
