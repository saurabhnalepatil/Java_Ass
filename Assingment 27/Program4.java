/*
Write a program which checks whether 7th & 8th & 9th bit is On or 
OFF. 
*/

import java.util.*;

class Program4
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter number is : ");
		iValue = sobj.nextInt();

		Lucifer obj = new Lucifer();

		bRet = obj.ChkBit(iValue);

		if(bRet == true)
		{
			System.out.println("7th & 8th & 9th bit is ON");
		}
		else
		{
			System.out.println("Bit is OFF");
		}
	}
}

class Lucifer
{
	public boolean ChkBit(int iNo)
	{
		int iMask = 0X000001C0; 
		int iResult = 0;
		boolean bAns = false;

		iResult =  iNo & iMask;

		if(iResult == iMask)
		{
			bAns = true;
		}
		return bAns;
	}
}