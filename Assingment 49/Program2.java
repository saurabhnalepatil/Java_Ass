/*
Write a recursive program which accept number from user and return 
summation of its digits.
Input : 879
Output : 24
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
		int iRet = obj.SumDigitR(value);

		System.out.println("Summation in Digit is: "+iRet);
	}
}

class Lucifer
{
	//Itration.....
	public int SumDigit(int iNo)
	{
		int iSum = 0,iDigit = 0;
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iSum = iSum + iDigit;
			iNo = iNo / 10;
		}
		return iSum;
	}

	//Recurtion...........
	int iDigit = 0;
	public int SumDigitR(int iNo)
	{
		iDigit = iNo % 10;
		if(iNo == 0){
			return 0;
		}
		else{
			return iDigit + SumDigitR(iNo / 10); 
		}	
	}
}