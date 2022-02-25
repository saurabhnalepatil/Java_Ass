/*
Accept N numbers from user and return frequency of even numbers.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 3
Program Layout : 
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;

		System.out.println("Enter the number of Ele:");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		iRet = obj.CountEven();

		System.out.println("Count of Even no : "+iRet);
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
	public int CountEven()
	{
		int iCount = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] % 2) == 0)
			{
				iCount++;
			}
		}
		return iCount;
	}
}