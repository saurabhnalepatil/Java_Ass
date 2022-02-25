/*
Write a program which accept string from user and count number of 
white spaces
Input : “MarvellouS”
Output : 0
Input : “MarvellouS Infosystems”
Output : 1
Input : “MarvellouS Infosystems by Piyush Manohar Khairnnar”
Output : 5
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		int iRet = obj.CountSpace();

		System.out.println("Count White Space : "+iRet);
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
	public int CountSpace()
	{
		int iCnt = 0;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == ' ') 
			{
			  	iCnt++;
			}
		}
		return iCnt;
	}
}