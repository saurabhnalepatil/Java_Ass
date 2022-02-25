/*
Write a java program which accept two two arrays from user and 
display minimum element of each array.
Input : 2 9 7 5 2 3
		9 3 5 5
Output : 2 3
*/

import java.util.*;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the First & Second Array Length");
		int iLen1 = sobj.nextInt();
		int iLen2 = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen1,iLen2);
		obj.ArrayA();
		obj.ArrayB();
		int iRet1 = obj.MinValArr1();
		int iRet2 = obj.MinValArr2();
		System.out.println("First Array Minmum value is-> "+iRet1);
		System.out.println("Second Array Minmum value is-> "+iRet2);
	}
}

class ArrayX
{
	public int Arr1[],Arr2[];

	public ArrayX(int size1,int size2)
	{
		Arr1 = new int[size1];
		Arr2 = new int[size2];
	}
	public void ArrayA()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+Arr1.length+" element first Array");
		for(int i = 0; i < Arr1.length; i++)
		{
			Arr1[i] = scan.nextInt();
		}
	}
	public void ArrayB()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+Arr2.length+" element first Array");
		for(int i = 0; i < Arr2.length; i++)
		{
			Arr2[i] = scan.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int value1, int value2)
	{
		super(value1,value2);
	}
	public int MinValArr1()
	{
		int iCnt = 0,iMin1 = 0;
		iMin1 = Arr1[iCnt]
		;
		for(iCnt = 0; iCnt < Arr1.length; iCnt++)
		{
			if(Arr1[iCnt] < iMin1){
				iMin1 = Arr1[iCnt];
			}
		}
		return iMin1;
	}
	public int MinValArr2()
	{
		int iCnt = 0,iMin2 = 0;
		iMin2 = Arr2[iCnt];
		
		for(iCnt = 0; iCnt < Arr2.length; iCnt++)
		{
			if(Arr2[iCnt] < iMin2){
				iMin2 = Arr2[iCnt];
			}
		}
		return iMin2;
	}
}