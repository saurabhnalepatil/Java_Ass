/*
Write Java program which accept array of characters from user and 
accept one character. Return occurrence of that character without 
considering case.
Input : b N e B R b A i G i B
b
Output : 4
*/

import java.util.*;

class Program3
{
	public static void main(String[] args)
	{

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Length Array");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.AcceptArr();
		obj.CountChar();
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
	public void CountChar()
	{
		Scanner scan = new Scanner(System.in);
		int iCnt = 0;

		System.out.println("Enter the Character to find of Array");
		char str = scan.next().charAt(0);

		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == str){
				iCnt++;
			}
		}
		System.out.println(str+" total in array -> "+iCnt);
	}
}