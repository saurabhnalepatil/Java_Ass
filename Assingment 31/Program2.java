/*
Write a program which accept string from user and count number of 
small characters.
Input : “Marvellous”
Output : 9
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		int iRet = obj.CountSmall();

		System.out.println("Total Count is Small Later is :"+iRet);
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
	public int CountSmall()
	{
		int iCnt = 0;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
			  	iCnt++;
			}
		}
		return iCnt;
	}
}

