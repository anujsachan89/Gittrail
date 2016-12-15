import java.util.Scanner;
public class Leap
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Year ");
int i = sc.nextInt();
 if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
                        System.out.println("Year " + i + " is a leap year");
                else
                        System.out.println("Year " + i + " is not a leap year");
        }
}
