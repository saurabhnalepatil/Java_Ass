/*
Write Java program which accept array of characters from user and 
return difference between frequency of capital and frequency of small 
characters.
Input : b N e B R b A I O G i
Output : 3 (7 - 4)
*/

import java.util.*;

class Program4
{
	public static void main(String[] args)
	{

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Length Array");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.AcceptArr();
		obj.Difference();
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
	public void Difference()
	{
		int iCnt1 = 0,iCnt2 = 0,iCnt = 0;
		//System.out.println("Count Captil Later in array");
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A')&&(Arr[i] <= 'Z'))
			{
				iCnt1++;
			}
			else if((Arr[i] >= 'a')&&(Arr[i] <= 'z'))
			{
				iCnt2++;
			}
		}
		iCnt = iCnt2 - iCnt1;
		System.out.println("Differnce between in Capital or Small later in Array ->"+iCnt);
	}
}