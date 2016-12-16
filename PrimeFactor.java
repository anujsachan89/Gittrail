import java.util.Scanner;

public class PrimeFactor
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
                 int i=2;

		while(num>1)
		{
		
	                        //int i=2;
				if(num%i==0)
				{
					System.out.println(i+" ");
					num=num/i;
                                       
                                         
				}
				else
					i++;
			
		}
	}
}
