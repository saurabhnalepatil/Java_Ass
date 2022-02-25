/*
Accept N numbers from user and return frequency of 11 form it.
Input : N : 6
Elements :85 66 3 15 93 88
Output : 0
Input : N : 6
Elements :85 11 3 15 11 111
Output : 2
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0,iRet = 0;

		System.out.println("Enter the number of Elements :");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		iRet = obj.Frequency();

		System.out.println("Frequency of 11 : "+iRet);
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

		System.out.println("Enter "+Arr.length+" Elements :");
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
	public int Frequency()
	{
		int iFreq = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == 11)
			{
				iFreq++;
			}
		}
		return iFreq;
	}
}