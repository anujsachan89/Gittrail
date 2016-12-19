import java.util.Scanner;
public class TwoDArray
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows M and number of columns N");
int m=sc.nextInt();
int n=sc.nextInt();
int arr[][]=new int[m][n];
for(int i=0;i<=m;i++)
{
  for(int j=0;j<=n;j++)
{
System.out.println(arr[i][j]);
}
}
}
}

