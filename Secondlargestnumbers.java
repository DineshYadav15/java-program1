import java.util.*;
class largestTwonumbers
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the limit number");
		int arr=s1.nextInt();
		int number[]=new int[arr];
		System.out.println("enter the numbers");
		for(int i=0;i<arr;i++)
		{
			number[i]=s1.nextInt();
		}
		int largest=0;
		int secondlargest=-1;
		for(int i=0;i<arr;i++)
		{
			if(number[i]>largest)
			{
				secondlargest=largest;
				largest=number[i];
			}
			else if(number[i]<largest&&number[i]>secondlargest)
			{
				secondlargest=number[i];
			}
		}
			System.out.println("enter second largest number " +secondlargest);
	}
}
				