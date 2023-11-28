import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])
{
int upper=0,i,white=0,lower=0;
String s1;
Scanner s=new Scanner(System.in);
s1=s.nextLine();
int n=s1.length();
for(i=0;i<n;i++)
{
if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
{
lower++;
}
else
if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
{
upper++;
}
else
{
white++;
}
}
System.out.println("lower="+lower);
System.out.println("upper="+upper);
System.out.println("white="+white);
}
}
