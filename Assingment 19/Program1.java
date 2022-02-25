/*
Accept N numbers from user and return the largest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 93
Program Layout :
*/

import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of elements : ");
		int iLen = sobj.nextInt();
		
		Lucifer obj = new Lucifer(iLen);
		obj.Accept();
		int iRet = obj.Maximum();

		System.out.println("Largest Number is : "+iRet);
	}
}
class ArrayX
{
	public int Arr[];

	public ArrayX(int Size)
	{
		Arr = new int[Size];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter " +Arr.length+ " elements :");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int iValue)
	{
		super(iValue);
	}
	public int Maximum()
	{ 
		int iMax = 0 ;
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] > iMax)
			{
				iMax = Arr[i];
			}
		}
		 return iMax;
	}
}