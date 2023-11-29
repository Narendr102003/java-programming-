import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
int upper=0,i,white=0,lower=0;
String s1,s2="";
Scanner s=new Scanner(System.in);
s1=s.nextLine();
int n=s1.length();
for(i=n-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
System.out.println(s2);
if(s1.equals(s2))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
