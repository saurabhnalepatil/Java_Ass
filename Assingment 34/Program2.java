/*
Accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 1
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
Program Layout : 
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Ele: ");
		int iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		System.out.println("Enter the perticular elements to Check a Index :");
		int iValue = sobj.nextInt();

		int iRet = obj.Occurrence(iValue);

		System.out.println("Index No. First Occurrence Ele: "+iRet);
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

		System.out.println("Enter "+Arr.length+" elements: ");
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
	public int Occurrence(int iNo)
	{
		int iCount = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(iNo != Arr[iCnt])
			{
				iCount++;
				if(Arr[iCnt] == iNo)
				{
					break;
				}
			}
		}
		return iCount-1;
	}
}