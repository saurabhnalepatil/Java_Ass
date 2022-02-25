/*
Write a program which accept string from user and count number of 
capital characters.
Input : “Marvellous Multi OS”
Output : 4
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		int iRet = obj.CapitalCount();

		System.out.println("Total Count is Capital Later is :"+iRet);
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
	public int CapitalCount()
	{
		int iCnt = 0;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{
			  	iCnt++;
			}
		}
		return iCnt;
	}
}