/*
Write java program which accept array from user and reverse each 
number of that array.
Input : 89 687 56 549 87 9
Output : 98 786 65 945 78 9
*/

import java.util.*;

class Program1
{
	public static void main(String[] args)
	{

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Length Array");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.AcceptArr();
		obj.RevresEle();
	}
}

class ArrayX
{
	public int Arr[];

	public ArrayX(int size)
	{
		Arr = new int[size];
	}
	public void AcceptArr()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Element in Array");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = scan.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int value)
	{
		super(value);
	}
	public void RevresEle()
	{
		int iDigit = 0; 
		System.out.println("Revers elements in array");
		for(int i = 0; i < Arr.length; i++)
		{
			while(Arr[i] != 0)
			{
				iDigit = Arr[i] % 10;
				System.out.print(iDigit);
				Arr[i] = Arr[i] / 10;
			}
			System.out.print(" ");
		}
	}
}