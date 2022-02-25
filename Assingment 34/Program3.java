/*
Accept N numbers from user and accept one another number as NO , 
return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 3
Input : N : 6
NO: 93
Elements :85 66 3 66 93 88
Output : 4
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iValue = 0, iRet = 0;

		System.out.println("Enter the number of Elements :");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		System.out.println("Enter Check Index No of Last Occ Ele :");
		iValue = sobj.nextInt();

		iRet = obj.LastOcc(iValue);

		System.out.println("Last Occ Ele Index No is : "+iRet);
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
	public int LastOcc(int iNo)
	{
		int iCnt = 0;
		for(iCnt = Arr.length-1; iCnt >= 0; iCnt--)
		{
			if(Arr[iCnt] == iNo)
			{
				break;
			}
			if(iCnt == -1)
			{
				return -1;
			}
		}
		return iCnt;
	}
}