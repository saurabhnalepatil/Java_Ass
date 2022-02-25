/*
Write Java program which accept array of characters from user and 
replace each capital character with its corresponding small character.
Input : b N j B R b A d G G
Output : b n j b r b a d g g
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
		obj.Convert();
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
	public void Convert()
	{
		System.out.println("Convert a Character captil to small later in Array Element");
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A')&&(Arr[i] <= 'Z'))
			{
				Arr[i] = (char)(Arr[i] + 'a' - 'A');
			  	System.out.print(Arr[i]+" ");
			}
			else{
				System.out.print(Arr[i]+" ");
			}
		}
	}
}