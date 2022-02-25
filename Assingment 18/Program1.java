/*
Accept N numbers from user and accept one another number as NO , 
check whether NO is present or not.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : TRUE
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : FALSE
*/

import java.util.*;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Elements :");
		int iSize = sobj.nextInt();

		Lucifer obj = new Lucifer(iSize);
		obj.Accept();

		System.out.println("Enter no Check data Preset or not :");
		int value = sobj.nextInt();

		boolean bRet = obj.Check(value);
		if(bRet == true){
			System.out.println("Data is Present");
		}
		else{
			System.out.println("Data is Absent in Array");
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
	public boolean Check(int iNo)
	{
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == iNo)
			{
				return true;
			}
		}
		return false;
	}
}