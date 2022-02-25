/*
Write a program which accept one number and position from user and 
check whether bit at that position is on or off. If bit is one return TURE 
otherwise return FALSE.
Input : 10 2
Output : TRUE
*/
import java.util.*;
class Program1
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		bRet = obj.OnBit();

		if(bRet == true)
		{
			System.out.println("Bit is ON");
		}
		else{
			System.out.println("Bit is OFF");
		}
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
	public boolean OnBit()
	{
		int iMask = 0X00000001;
		int iResult = 0;
		if((iPos < 1) && (iPos > 32))
		{
			System.out.println("Invalid Bit Position");
		}
		iMask = iMask<<(iPos -1);
		iResult = iNo & iMask;
		if(iResult == iMask)
		{
			return true;
		}
		return false;
	}
}