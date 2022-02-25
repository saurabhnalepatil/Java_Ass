/*
Write a java program which accept number from user and return the 
count of even digits.
Input : 2395 
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4
*/

import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0,iRet = 0;

		System.out.println("Enter number : ");
		iValue = sobj.nextInt();

		Lucifer obj = new Lucifer();

		iRet = obj.CountEven(iValue);

		System.out.println("Count of Even digit : "+iRet);
	}
}

class Lucifer
{
	public int CountEven(int iNo)
	{
		int iDigit = 0, iCnt = 0;
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if((iDigit % 2) == 0)
			{
				iCnt++;
			}
			iNo = iNo / 10;
		}
		return iCnt;
	}
}