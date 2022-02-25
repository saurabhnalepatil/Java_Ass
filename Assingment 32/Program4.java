/*
Accept N numbers from user and display all such elements which are 
divisible by 3 and 5.
Input : N : 6
Elements :85 66 3 15 93 88
Output : 15
Program Layout : 
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;

		System.out.println("Enter the number of Elements : ");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();
		obj.Divisible();
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
	public void Divisible()
	{
		System.out.println("Divisible in 3 & 5 are :");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(((Arr[iCnt]%3)==0)&&((Arr[iCnt]%5)==0))
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}