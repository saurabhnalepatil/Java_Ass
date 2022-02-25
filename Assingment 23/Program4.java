/*
Write a program which accept string from user and display only 
digits from that string.
Input : “marve89llous121”
Output : 89121
Input : “Demo”
Output : 
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.DisplayDigit();

		//System.out.println("Total Count is Small Later is :"+iRet);
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
	public void DisplayDigit()
	{
		int iCnt = 0;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= '0') && (Arr[i] <= '9'))
			{
			  	System.out.print(Arr[i]);
			}
		}
	}
}