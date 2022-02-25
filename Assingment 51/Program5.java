/*
Write Java program which accept two arrays from user and display 
summation of each array.
Input : 2 9 7 5 2 3
		9 3 5 5
Output : 28 22
*/

import java.util.*;

class Program5
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
		obj.SumArr();
	}
}

class ArrayX
{
	public int Arr1[],Arr2[],iSum1,iSum2;

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
			iSum1 = iSum1 + Arr1[i];
		}
	}
	public void ArrayB()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+Arr2.length+" element first Array");
		for(int i = 0; i < Arr2.length; i++)
		{
			Arr2[i] = scan.nextInt();
			iSum2 = iSum2 + Arr2[i];
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int value1, int value2)
	{
		super(value1,value2);
	}
	public void SumArr()
	{
		System.out.println("First Array sumation is ->"+iSum1);
		System.out.println("Second Array sumation is ->"+iSum2);

	}
}