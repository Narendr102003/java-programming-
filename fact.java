import java.util.Scanner;
class fact
{
public static void main(String[] args)
{
Scanner fact= new Scanner(System.in);
System.out.println("enter value");
int n = fact.nextInt();
int i,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial of 5:"+f);
}
}

