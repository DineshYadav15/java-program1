import java.util.*;
class Countinteger
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s1.nextInt();
		int count=0;
		//int r;
		while(num!=0)
		{
			//r=num%10;
			num=num/10;
			
			count++;
		}
		System.out.println(count);
	}
}