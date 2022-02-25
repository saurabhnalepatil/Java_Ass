/*
Accept N numbers from user check whether that numbers contains 11 in 
it or not.
Input : N : 6
Elements :85 66 11 80 93 88
Output : 11 is present
Input : N : 6
Elements :85 66 3 80 93 88
Output : 11 is absent
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;
		boolean bRet = false;

		System.out.println("Enter the number of Ele :");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		bRet = obj.Check();

		System.out.println("Check Wheather 11 Present or Not:");
		if(bRet == true)
		{
			System.out.println("11 is Present");
		}
		else
		{
			System.out.println("11 is Absent");
		}
	}
}

class ArrayX
{
	public int Arr[];

	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter "+Arr.length+" elements :");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int iValue)
	{
		super(iValue);
	}
	public boolean Check()
	{
		boolean bAns = false;
		
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == 11)
			{
				bAns = true;
			}
		}
		return bAns;
	}
}