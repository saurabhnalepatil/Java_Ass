/*
Write a program which accept string from user and convert it into 
lower case.
Input : “Marvellous Multi OS”
Output : marvellous multi os
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.StrlwrX(); 
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter String :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("Updated String is : ");
	}
}

class Lucifer extends StringX 
{
	public void StrlwrX()
	{
		//System.out.println(str.toLowerCase());
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <='Z'))
			{
				Arr[i] = (char)(Arr[i]+ 'a' - 'A');
				System.out.print(Arr[i]);
			}
			else
			{
				System.out.print(Arr[i]);
			}
		}
	}
}
		