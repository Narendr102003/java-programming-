import java.io.*;
import java.util.*;
class matrix
{
public static void main(String args[])
{
int a[][]=new int[5][5];
int i,j,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter 1st matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s.nextInt();
}
}
for(i=0;i<3;i++)
{
sum=sum+a[i][i];
}
System.out.println("sum of diagonals:"+sum);

}
}

