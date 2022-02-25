/*
Accept N numbers from user and display all such elements which are 
even and divisible by 5.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 80
Program Layout :
*/

import java.util.*;

class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0; //iRet = 0;

		System.out.println("Enter the number of Elements : ");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		//probj.Display();
		obj.Divisible();

		//System.out.println("Divisible by 5 : "+iRet);
	}
}

class ArrayX
{
	public int Arr[];

	public ArrayX(int iSize)
	{
		Arr = new int [iSize];
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
	/*public void Display()
	{
		Scanner sobj = new Scanner(System.in);
		int iCnt = 0;
		System.out.println("Elements are : ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}*/
}

class Lucifer extends ArrayX
{
	public Lucifer(int iValue)
	{
		super(iValue);
	}
	public void Divisible()
	{
		int iDivi = 0, iCnt = 0;
		System.out.println("Divisible by 5 : ");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if((Arr[iCnt] % 5) == 0)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}