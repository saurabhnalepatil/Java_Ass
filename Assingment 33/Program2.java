/*
Write a program which accept number from user and return the 
count of odd digits.
Input : 2395 
Output : 3
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 0
*/

import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		Lucifer obj = new Lucifer();

		iRet = obj.CountOdd(iValue);

		System.out.println("Count of Odd iDigit :"+iRet);
	}
}

class Lucifer
{
	public int CountOdd(int iNo)
	{
		int iCnt = 0, iDigit = 0;
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if((iDigit % 2) != 0)
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}