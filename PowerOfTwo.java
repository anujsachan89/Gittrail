import java.util.Scanner;
public class PowerOfTwo
{
public static void main (String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Power which should be less than 30");
int a = sc.nextInt();
int result = 1;
for(int i=1;i<=a;i++)
{
result=result*2;
}
System.out.println(a+"th power of 2 is :"+result);
}
}

