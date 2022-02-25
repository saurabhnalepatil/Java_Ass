/*
Write a program which accept one number from user and on its first 4 
bits. Return modified number.
Input : 73
Output : 79
*/
import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		int iRet = obj.OnBit();

		System.out.println("Bit on after Updated value is : "+iRet);
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
	public int OnBit()
	{
		int iMask = 0X0000000f;
		int iResult = 0;

		iResult = iNo | iMask;
		return iResult;
	}
}