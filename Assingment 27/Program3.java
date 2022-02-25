//Write a program which checks whether 7th & 15th & 21st , 28th bit 
// is On or OFF. 
import java.util.*;

class Program3
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
			System.out.println("7th & 15th & 21st , 28th bit is ON");
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
		int iMask =0x08104040; 
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