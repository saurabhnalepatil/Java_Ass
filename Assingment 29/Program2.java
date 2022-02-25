/*
Write a program which accept one number and position from user and off 
that bit. Return modified number.
Input : 10 2
Output : 8
*/
import java.util.*;
class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		int iRet = obj.OffBit();

		System.out.println("Off Bit After updated value : "+iRet);
	}
}

class BitX
{
	public int iNo,iPos;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		iNo = sobj.nextInt();
	}
	public void Accept2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Position : ");
		iPos = scan.nextInt();
	}
}

class Lucifer extends BitX 
{
	public int OffBit()
	{
		int iMask = 0X00000001;
		int iResult = 0;
		if((iPos < 1) && (iPos > 32))
		{
			System.out.println("Invalid Bit Position");
		}
		iMask = iMask<<(iPos -1);
		iResult = iNo ^ iMask;
		return iResult;
	}
}