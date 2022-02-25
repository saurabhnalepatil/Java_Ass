/*
Write a program which checks whether first and last bit is On or 
OFF. First bit means bit number 1 and last bit means bit number 32.
*/

import java.util.*;



class Program5
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
			System.out.println("First Bit or Last Bit is ON");
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
		int iMask = 0X80000001;
		int iResult = 0;
		boolean bAns = false;

		iResult = iNo & iMask;

		if(iResult == iMask)
		{
			bAns = true;
		}
		return bAns;
	}

}