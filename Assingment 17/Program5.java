/*
Accept N numbers from user and accept one another number as NO , 
return frequency of NO form it.
Input : N : 6 
NO: 66
Elements :85 66 3 66 93 88
Output : 2
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : 0
Program Layout : 
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0,iRet = 0,iValue2 = 0;

		System.out.println("Enter the number of elements : ");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		System.out.println("Enter Ele Check Frequency that no : ");
		iValue2 = sobj.nextInt();

		iRet = obj.FreqNo(iValue2);

		System.out.println("Frequency of number : "+iRet);
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
	public int FreqNo(int iNo)
	{
		int iFreq = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] == iNo)
			{
				iFreq++;
			}
		}
		return iFreq;
	}
}