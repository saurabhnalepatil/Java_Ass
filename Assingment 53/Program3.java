/*
Write java program which accept array of characters from user and 
count number of capital characters.
Input : b N j B R b A d G G
Output : 6
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
		obj.CountCaptil();
	}
}

class ArrayX
{
	public char Arr[];

	public ArrayX(int size)
	{
		Arr = new char[size];
	}
	public void AcceptArr()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Element in Array");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = scan.next().charAt(0);
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int value)
	{
		super(value);
	}
	public void CountCaptil()
	{
		int iCnt = 0;
		//System.out.println("Count Captil Later in array");
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A')&&(Arr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		System.out.println("Total Captil later in array ->"+iCnt);
	}
}