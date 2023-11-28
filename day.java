import java.io.*;
import java.util.*;
class day
{
public static void main(String args[])
{
Scanner e=new Scanner(System.in);
System.out.println("enter the day");
int n= e.nextInt();
int x=n%7;
switch(x)
{
case 1:
System.out.println("sunday");
break;
case 2:
System.out.println("monday");
break;
case 3:
System.out.println("tuesday");
break;
case 4:
System.out.println("wednesday");
break;
case 5:
System.out.println("thursday");
break;
case 6:
System.out.println("friday");
break;
case 7:
System.out.println("saturday");
break;
default:
System.out.println("only seven days,no day on this number");
}
}
}
