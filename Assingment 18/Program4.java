/*
Accept N numbers from user and accept Range, Display all elements from 
that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 66 76 88
Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :
Program Layout : 
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Elements : ");
		int iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		System.out.println("Enter the Start Ele :");
		int iValue1 = sobj.nextInt();

		System.out.println("Enter the Last Ele : ");
		int iValue2 = sobj.nextInt();

		System.out.println("Range of Between to Number : ");

		obj.RangeBet(iValue1,iValue2);	
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
	public void RangeBet(int iStart, int iEnd)
	{
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] > iStart) && (Arr[iCnt] < iEnd))
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}