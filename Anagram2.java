import java.util.Scanner;

public class Anagram2
{
	public static void main (String [] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String input1 = sc.nextLine();
		System.out.println("Enter Second String");
		String input2 = sc.nextLine();
		{




							
								int len,len1,len2,i,j;
								int found=0,notfound=0;
								len1=input1.length();
								len2=input2.length();
								if(len1==len2)
								{
								len=len1;
								for(i=0;i<len;i++)
								{
								found=0;
								for(j=0;j<len;j++)
								{
								if(input1.charAt(i)==input2.charAt(j))
								  {
									found=1;
									 break;
								  		}
								 		}
										}
										if(found==0)
											{
											notfound=1;
											//break;
											}

											if (notfound==1)
											{
											System.out.println("there is no anagram in a string");
											}
											else
											{
											System.out.println("Strings are anagram");
											}
										}
									else
									System.out.println("length are not equal");
									}
									}
									}

