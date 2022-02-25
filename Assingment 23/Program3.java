/*
Write a program which accept string from user and toggle the case.
Input : “Marvellous Multi OS”
Output : mARVELLOUS mULTI os
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		System.out.println("Result is : ");
		obj.strtoggleX();

		//System.out.println("After a Toggle String : "+sRet);
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
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX 
{
	public void strtoggleX()
	{
		char Arr[] = str.toCharArray();
		
		//char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
			  	Arr[i] = (char)(Arr[i] +'A' - 'a');
			  	System.out.print(Arr[i]);
			}
			else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{
			  	Arr[i] = (char)(Arr[i] +'a' - 'A');
			  	System.out.print(Arr[i]);
			}
		}
		//return String.valueOf(Arr);
	}
}