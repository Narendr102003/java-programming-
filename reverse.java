import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
int n,a,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
a=n%10;
sum=sum*10+a;
n=n/10;
}
System.out.println("reverse number is "+sum);
}
}

