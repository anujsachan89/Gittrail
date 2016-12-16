import java.util.Scanner;
public class Gambler
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how much stake you have");
		int stake=sc.nextInt();
		System.out.println("enter how many times you wants play");
		int trials=sc.nextInt();
		System.out.println("set a goal");
		int goal=sc.nextInt();
		int loss=0;
		int win=0;
		for(int t=1;t<=trials;t++)
		{
			int cash=stake;
			while(cash > 0 && cash < goal )
			{
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
					cash--;
			}
			if(cash==goal)
			{
				win++;
			}
			else
				loss++;
		}
		System.out.println("no. of wins " +win );
		System.out.println("no. of loss "+loss);
	}
}
