/*
Write Java program which accept array of characters from user and 
replace each capital character with its corresponding small character.
Input : b N e B R b A i G i
Output : 4
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
		obj.CountSmall();
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
	public void CountSmall()
	{
		int iCnt = 0;
		//System.out.println("Count Small Later in array");
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a')&&(Arr[i] <= 'z'))
			{
				iCnt++;
			}
		}
		System.out.println("Total Small later in array ->"+iCnt);
	}
}