import java.util.*;
class Largestnumber
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the limit number");
		int num=s1.nextInt();
		int number[]=new int[num];
		System.out.println("enter the  number");
		for(int i=0;i<num;i++)
		{
			number[i]=s1.nextInt();
			
		}
		int largest=0;
		for(int i=0;i<num;i++)
		{
			if(number[i]>largest)
				largest=number[i];
		}
		System.out.println("largest number in array" + largest);
	}
}
		