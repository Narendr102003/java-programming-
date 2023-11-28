import java.io.*;
import java.util.*;
class vowels
{
public static void main(String args[])
{
int c=0,i;
String s1;
Scanner s=new Scanner(System.in);
s1=s.nextLine();
s1=s1.toLowerCase();
int n=s1.length();
for(i=0;i<n;i++)
{
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
{
c++;
}
}
System.out.println("noof vowels:"+c);
}
}



