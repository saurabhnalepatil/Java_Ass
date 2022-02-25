/*
Write a program which accept one number from user and toggle contents 
of first and last nibble of the number. Return modified number. (Nibble is 
group of four bits)
*/

import java.util.*;
class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		//obj.Accept2();
		long iRet = obj.ToggleNible();

		System.out.println("Toggle Nible After updated value : "+iRet);
	}
}

class BitX
{
	public long iNo,iPos;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		iNo = sobj.nextLong();
	}
	public void Accept2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Position : ");
		iPos = scan.nextLong();
	}
}

class Lucifer extends BitX 
{
	public long ToggleNible()
	{
		long iMask = 0Xf000000f;
		long iResult = 0;
		if((iPos < 1) && (iPos > 32))
		{
			System.out.println("Invalid Bit Position");
		}
		iResult = iNo ^ iMask;
		return iResult;
	}
}