import java.util.*;
class Reversenumber
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s1.nextInt();
		int r;
		int rev=0;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println("reverse number = " + rev);
	}
}