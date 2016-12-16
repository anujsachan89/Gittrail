import java.util.Scanner;
public class HarmonicNumber
{
	public static void main (String [] args)
	{
		System.out.println("Enter nth Harmonic Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double n1=0.0;
		double n2=0.0;
		double result=0.0;
		for(int i=2;i<=a;i++)
			{
				n1=1.0f/i;
				n2=n2+n1;
			//result=n1+n2;
			}
				System.out.println(" "+n2);
	}
}
