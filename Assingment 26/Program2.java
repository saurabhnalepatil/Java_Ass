/*
Write a program which accept string from user and copy that 
characters of that string into another string by removing all white 
spaces.
Input : “Marvel lous Pyth on”
Output : “MarvellousPython”
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.StrCpyX();
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sobj.nextLine();
	}
}

class Lucifer extends StringX
{
	public void StrCpyX()
	{
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] != ' ')
			{
				System.out.print(Arr[i]);
			}
		}
	}
}