/*
Write a program which accept one number from user and off 7th bit of that 
number if it is on. Return modified number.
Input : 79
Output : 15
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		int iRet = obj.OffBit();

		System.out.println("Updated value is : "+iRet);
	}
}

class BitX
{
	public int iNo;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		iNo = sobj.nextInt();
	}
}

class Lucifer extends BitX 
{
	public int OffBit()
	{
		int iMask = 0X00000040;
		int iResult = 0;

		iResult = iNo ^ iMask;
		return iResult;
	}
}