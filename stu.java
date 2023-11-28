import java.io.*;
import java.util.*;
class stu
{
public static void main(String args[])
{
int regno,m1,m2,m3,m4,m5;
String name;
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
name=s.nextLine();
System.out.println("enter regno:");
regno=s.nextInt();
System.out.println("enter marks:");
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
int total=m1+m2+m3+m4+m5;
int avg=total/5;
if(m1>=50&&m2>=50&&m3>=50&&m4>=50&&m5>=50)
{
System.out.println("total marks: "+total);
System.out.println("avearage : "+avg);
if(avg>=90)
{
System.out.println("the grade is A+");
}
else if(avg>=80&&avg<90)
{
System.out.println("the grade is A");
}
else if(avg>=70&&avg<80)
{
System.out.println("the garde is B");
}
else if(avg>=60&&avg<70)
{
System.out.println("the grade is C");
}
else
{
System.out.println("the grade is D");
}
}
else
{
System.out.println("you failed the subjct");
}

}}
