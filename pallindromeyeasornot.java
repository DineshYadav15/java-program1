import java.util.*;
class pallindromeyeasornot
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the numbers");
		int num = s1.nextInt();
		int r;
		int ans=0;
		int h=num;
		while(num>0)
		{
		r=num%10;
	    ans=ans*10+r;
		num=num/10;
		}
		if(ans==h)
		{
			System.out.println("it is palindrome number");
		}
		else
		{
			System.out.println("it is not palindrome number");
		}
	}
}
			
		