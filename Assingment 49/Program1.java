/*
Write a recursive program which accept number from user and display below 
pattern. 
Input : 5
Output : 5 * 4 * 3 * 2 * 1 *
Prototype :
*/
import java.util.*;

class Program2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int value = scan.nextInt();

		Lucifer obj = new Lucifer();
		obj.patternR(value);

		//System.out.println("Largest Digit is :"+iRet);
	}
}

class Lucifer
{
	public void pattern(int iNo)
	{
		for(int i = iNo; i >= 1; i--)
		{
			System.out.print(i+" * ");
		}
	}
	public static void patternR(int iNo)
	{
		int i = iNo;
		if(i >= 1)
		{
			System.out.print(i+" * ");
		}
		if(i > 0){
			patternR(iNo -1);
		}	
	}
}