import java.util.*;
class Primeornot
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		int count=0;
		for(int i=2;i<num-1;i++)
		{
		if(num%i==0)
		{
			
			count++;
		}
		}
		if(count==0)
		{
			System.out.println("it is  prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}
}