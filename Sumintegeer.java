import java.util.*;
class Sumintegeer
{
	public static void main(String args[])
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter any number");
		int num = S1.nextInt();
		int sum=0;
		int r;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.println("total number of sum " + sum);
	}
}
	