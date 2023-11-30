import java.io.*;
import java.util.*;
class bank
{
void getrateofinterest()
{
System.out.println("rate of interest differ accordingly");
}
}
class SBI extends bank
{
void getrateofinterest1()
{
System.out.println("Sbi is 8.4%");
}
}
class ICICI extends bank
{
void getrateofinterest2()
{
System.out.println("icici is 7.3%");
}
}
class axis extends bank
{
void getrateofinterest3()
{
System.out.println("axis is 9.7%");
}
}
class interest
{
public static void main(String args[])
{
SBI s=new SBI();
s.getrateofinterest();
s.getrateofinterest1();
ICICI i=new ICICI();
i.getrateofinterest2();
axis a=new axis();
a.getrateofinterest3();
}
}
