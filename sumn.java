import java.io.*;
import java.util.*;
class sumn
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int i=1,sum=0;
do
{
sum=sum+i;
i++;
}
while(i<n);
System.out.println("sum="+sum);
}
}
