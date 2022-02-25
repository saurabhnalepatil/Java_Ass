/*
Accept N numbers from user and return difference between frequency of 
even number and odd numbers.
Input : N : 7
Elements :85 66 3 80 93 88 90
Output : 1 (4 -3)
Program Layout : 
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;

		System.out.println("Enter the number of Ele:");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		iRet = obj.FreqDiff();

		System.out.println("Difference between Even or Odd Freq: "+iRet);
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

		System.out.println("Enter "+Arr.length+" elements : ");
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
	public int FreqDiff()
	{
		int Efreq = 0, Ofreq = 0, iDiff = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] % 2) == 0)
			{
				Efreq++;
			}
			else{
				Ofreq++;
			}
		}
		iDiff = Efreq - Ofreq;
		return iDiff;
	}

}