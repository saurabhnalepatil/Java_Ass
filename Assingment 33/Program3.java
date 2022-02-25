/*
Write a program which accept number from user and return the 
count of digits in between 3 and 7.
Input : 2395 
Output : 1
Input : 1018
Output : 0
Input : 4521
Output : 2
Input : 9922
Output : 0
*/

import java.util.*;

class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		Lucifer obj = new Lucifer();

		iRet = obj.CountRange(iValue);

		System.out.println("Count of between 3 and 7 digit : "+iRet);
	}
}

class Lucifer
{
	public int CountRange(int iNo)
	{
		int iDigit = 0, iCnt = 0;
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if((iDigit > 3) && (7 > iDigit))
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}