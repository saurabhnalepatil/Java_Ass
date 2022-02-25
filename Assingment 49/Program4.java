/*
Write a recursive program which accept number from user and return its 
factorial. 
Input : 5
Output : 120
Prototype : 
*/

import java.util.*;

class Program4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int value = scan.nextInt();

		Lucifer obj = new Lucifer();
		int iRet = obj.factorialR(value);

		System.out.println("factorial is: "+iRet);
	}
}

class Lucifer
{
	static int iFact = 1;
	//Itration.....
	public int factorial(int iNo)
	{
		for(int i = iNo; i >= 1; i--)
		{
			iFact = iFact * i;
		}
		return iFact;
	}
//  Recrution
	public int factorialR(int iNo)
	{
		if(iNo == 0){
			return 0;
		}
		else{
			iFact = iFact * iNo;
			factorialR(iNo-1);
			return iFact;
		}
	}
}
