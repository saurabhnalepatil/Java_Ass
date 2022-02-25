/*
Write a program which accept one number from user and toggle 7th bit of 
that number. Return modified number.
Input : 137
Output : 201
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		int iRet = obj.ToggleBit();

		System.out.println("Toggle bit After Updated value is : "+iRet);
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
	public int ToggleBit()
	{
		int iMask = 0X00000040;
		int iResult = 0;

		iResult = iNo ^ iMask;
		return iResult;
	}
}