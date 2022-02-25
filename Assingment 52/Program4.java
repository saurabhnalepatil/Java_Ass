/*
Write Java program which accept two arrays from user and form 
new array which is combination of contents of first and second array.
Input : 12 57 28 3
99 23 54 58 6 67
Output : 12 57 28 3 99 23 54 58 6 67
*/

import java.util.*;

class Program4
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First & Second Array Length");
		int iLen1 = sobj.nextInt();
		int iLen2 = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen1,iLen2);
		obj.ArrayA();
		obj.ArrayB();
		obj.CopyArrEle();
	}
}

class ArrayX
{
	public int Arr1[],Arr2[];

	public ArrayX(int size1, int size2)
	{
		Arr1 = new int [size1];
		Arr2 = new int [size2];
	}
	public void ArrayA()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Array element: ");
		for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
		{
			Arr1[iCnt] = scan.nextInt();
		}
	}
	public void ArrayB()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Second Array element: ");
		for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
		{
			Arr2[iCnt] = scan.nextInt();
		}
	}
}

class Lucifer extends ArrayX 
{
	public Lucifer(int iValue1,int iValue2)
	{
		super(iValue1,iValue2);
	}
	public void CopyArrEle()
	{
		Scanner scan = new Scanner(System.in);
		int iLen = Arr1.length + Arr2.length;
		int Arr[] = new int[iLen];

		System.out.println("Copy Array element:");
		for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
		{
			Arr[iCnt] = scan.nextInt();
		}
	}
	public ArrDisplay()
	{
		System.out.println("Display First Array Element : - ");
		for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
		{
			sA
		}
	}
}