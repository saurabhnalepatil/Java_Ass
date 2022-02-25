/*
Accept N numbers from user and display all such numbers which contains 
3 digits in it.
Input : N : 6
Elements :8225 665 3 76 953 858
Output : 665 953 858
Program Layout :
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;

		System.out.println("Enter the number of Elements:");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		System.out.println("Elements of 3 Digit is :");
		obj.Digit();
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

		System.out.println("Enter "+Arr.length+" Elements :");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
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
	public void Digit()
	{
		int iDigit = 0, iNo = 0, iTemp = 0;
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			iTemp = Arr[iCnt];
			while(Arr[iCnt] != 0)
			{
				iDigit = Arr[iCnt] % 10;
				iNo++;
				Arr[iCnt] = Arr[iCnt] / 10;
			}
				if(iNo == 3)
				{
					System.out.println(iTemp);
				}	
			iNo = 0;	
		}
	}
}