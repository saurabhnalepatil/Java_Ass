//Write a program which checks whether 5th & 18th bit is On or OFF.

import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter Number : ");
		iValue = sobj.nextInt();

		Lucifer obj = new Lucifer();

		bRet = obj.ChkBit(iValue);

		if(bRet == true)
		{
			System.out.println("5th & 18th Bit is ON");
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
		boolean bAns = false;
		int iMask = 0x00020010;
		int iResult = 0;

		iResult = iNo & iMask;

		if(iResult == iMask)
		{
			bAns = true;
		}
		return bAns;
	}
}