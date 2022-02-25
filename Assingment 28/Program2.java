/*
Write a program which accept one number from user and off 7th and 10th 
bit of that number. Return modified number.
Input : 577
Output : 1
*/
import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		int iRet = obj.OffBit();

		System.out.println("Bit off after Updated value is : "+iRet);
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
		int iMask = 0X00000240;
		int iResult = 0;

		iResult = iNo ^ iMask;
		return iResult;
	}
}