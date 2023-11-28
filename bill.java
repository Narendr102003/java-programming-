import java.io.*;
import java.util.*;
class add
{
String s[]=new String[5];
int q[]=new int[5];
int p[]=new int[5];
int a[]=new int[5];
int i,n=5,total;
void getdata()
{
Scanner a=new Scanner(System.in);
for(i=0;i<n;i++)
{
s[i]=a.nextLine();
}
for(i=0;i<n;i++)
{
q[i]=a.nextInt();
}
for(i=0;i<n;i++)
{
p[i]=a.nextInt();
}
}
void display()
{
for(i=0;i<n;i++)
{
a[i]=q[i]*p[i];
}
for(i=0;i<n;i++)
{
total=total+a[i];
}
System.out.println("sno \t\t itemname \t qty \t price \t amount");
for(i=0;i<n;i++)
{
System.out.println((i+1)+"\t\t"+s[i]+"\t\t"+q[i]+"\t\t"+p[i]+"\t\t"+a[i]);
}
System.out.println("                          totalamount="+total);
}
}

class bill
{
public static void main(String args[])
{
add b=new add();
b.getdata();
b.display();
}
}
