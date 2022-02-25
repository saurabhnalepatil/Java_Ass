/*
Write java program which accept array from user and replace each 
member with summation of its digit.
Input : 89 687 56 549 87 9
Output : 17 21 11 18 15 9
*/
import java.util.*;

class Program2
{
	public static void main(String[] args)
	{

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Length Array");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.AcceptArr();
		obj.SumOfEle();
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
	public void SumOfEle()
	{
		int iDigit = 0,iSum = 0; 
		System.out.println("Sumation of elements in array");
		for(int i = 0; i < Arr.length; i++)
		{
			while(Arr[i] != 0)
			{
				iDigit = Arr[i] % 10;
				iSum = iSum + iDigit;
				Arr[i] = Arr[i] / 10;
			}
			System.out.print(iSum+" ");
			iSum = 0;
		}
	}
}