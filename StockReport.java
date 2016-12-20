import java.util.Scanner;
public class StockReport
{

int number;
String name[]=new String[100];
int share[]=new int[100];
int value[]=new int[100];
int total[]=new int[100];
int allTotal=0;

Scanner sc=new Scanner(System.in);
 public void entry()
{
this.number=number;
for(int i=0;i<number;i++)
{ 
 System.out.println("\n please enter details of stock:"+(i+1));
  System.out.println("Name:");
  name[i]=sc.nextLine();
  System.out.println("enter no of share");
  share[i]=sc.nextInt();
  System.out.println("value of each share");
  value[i]=sc.nextInt();
}
}
public void calculate()
{
for(int i=0;i<number;i++)
{
total[i]=share[i]*value[i];

System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs.");
}
}
public void totalval()
{
for(int i=0;i<number;i++)
{
allTotal=allTotal+total[i];
}
System.out.println("\n total value of all"+number+ " stock is"+allTotal);
}


public static void main(String []args)
{
StockReport s1=new StockReport();
s1.entry();
s1.calculate();
s1.totalval();
}
}

