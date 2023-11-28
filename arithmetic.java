import java.io.*;
import java.util.*;
class arithmetic
{
public static void main(String args[])
{
int a,b,x;
Scanner o=new Scanner(System.in);
System.out.println("enter two numbes");
a=o.nextInt(); 
b=o.nextInt();
System.out.println("choose the arithemetic operation number");
System.out.println("1-sum,2-difference,3-product,4-remainder,5-quotient");
x=o.nextInt();
switch(x)
{
case 1:
System.out.println("sum of two numbers:"+(a+b));
break;
case 2:
System.out.println("diff of two numbers:"+(a-b));

break;
case 3:
System.out.println("product of two numbers:"+(a*b));
break;
case 4:
System.out.println("remainder of two numbers division:"+(a%b));
break;
case 5:
System.out.println("quotient of two numbers division:"+(a/b));
break;
default:
System.out.println("invalid number");
}
}
}

