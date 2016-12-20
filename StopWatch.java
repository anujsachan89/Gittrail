import java.util.Scanner;
public class StopWatch
{
	long ElapsedTime=0;
	long StartTime=0;
	long StopTime=0;
	// Stop watch start method/
	public void start()
	{
	StartTime = System.currentTimeMillis();
	}
	// Stop Method/		
		public void stop()
		{
		StopTime=System.currentTimeMillis();
		}
	// Elaspsed TIme/		
			public long ElapsedTime()
			{
			ElapsedTime = (StopTime - StartTime);
			return ElapsedTime;
			}
				 	
					public static void main(String[] args)
                      {
						StopWatch w = new StopWatch();
						Scanner sc = new Scanner(System.in);
						System.out.println("Please Choose your option: \n1.Start \n2. Stop");
						int num=sc.nextInt();
						w.start();			
						System.out.println("Time is Started\nPlease Enter 2 for Stopping the clock: ");
						int num2=sc.nextInt();
						w.stop();
						System.out.println("Elapsed Time-: "+w.ElapsedTime()+" mili Seconds");
						}
}
