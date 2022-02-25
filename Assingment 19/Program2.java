/*
Accept N numbers from user and return the smallest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 3
Program Layout :
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Ele : ");
		int iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		int iRet = obj.Smallest();

		System.out.println("Smallest number of Array Ele : "+iRet);
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
	public int Smallest()
	{
		int iMin = 0,iCnt = 0;

		iMin = Arr[iCnt];

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}
		}
		return iMin;
	}
}