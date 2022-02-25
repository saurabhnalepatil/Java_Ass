/*
Accept N numbers from user and display all such elements which are 
multiples of 11.
Input : N : 6
Elements :85 66 3 55 93 88
Output : 66 55 88
Program Layout : 
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;

		System.out.println("Enter number of Elements :");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		obj.Multiples();
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
		int iCnt = 0;
		System.out.println("Enter "+Arr.length+" Elements : ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
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
	public void Multiples()
	{
		int iCnt = 0;
		System.out.println("Multiples of 11 Ele : ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] % 11) == 0)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}