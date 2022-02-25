/*
Write Java program which accept two arrays from user and form 
new array which is combination of contents of first and second array.
Input : 12 57 28 3
		99 23 54 58 6 67
Output : 12 57 28 3 99 23 54 58 6 67
*/

import java.util.*;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First Array of Number:->");
		int iLen1 = sobj.nextInt();
		System.out.println("Enter Second Array of Number:->");
		int iLen2 = sobj.nextInt();

		int value = iLen2+iLen1;
		Lucifer obj = new Lucifer(iLen1,iLen2,value);
		obj.Accept1();
		obj.Accept2();
		//obj.Display1();
		//obj.Display2();
		obj.NewArr();
	}
}

class ArrayX
{
	public int Arr1[],Arr2[],Arr3[];
	
	public ArrayX(int iSize1,int iSize2,int iSize3)
	{
		Arr1 = new int [iSize1];
		Arr2 = new int [iSize2];
		Arr3 = new int [iSize3];

	}
	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first Array "+Arr1.length+" Elements:-> ");
		for(int iCnt = 0; iCnt < Arr1.length;iCnt++)
		{
			Arr1[iCnt]=Arr3[iCnt] = sobj.nextInt();
		}
	}
	public void Accept2()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Second Array "+Arr2.length+" Elements:-> ");
		for(int iCnt = 0; iCnt < Arr2.length;iCnt++)
		{
			Arr2[iCnt] = sobj.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int iValue1,int iValue2,int iValue3)
	{
		super(iValue1,iValue2,iValue3);
	}
	public void Display1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("You Enter the Array (1) Elements:->");
		for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
		{
			Arr1[iCnt] = Arr3[iCnt];
			Arr3[iCnt] = sobj.nextInt();
			//System.out.print(Arr1[iCnt]+"\t");
		}
	}
	public void Display2()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("\nYou Enter the Array (2) Elements:->");
		for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
		{
			Arr2[iCnt] = Arr3[iCnt];
			Arr3[iCnt] = sobj.nextInt();
			//System.out.print(Arr2[iCnt]+"\t");
		}
	}
	public void NewArr()
	{
		System.out.println("Enter the Third Array elements:->");
		for(int i = 0; i < Arr3.length; i++)
		{
			System.out.print(Arr3[i]+"\t");
		}
	}
}