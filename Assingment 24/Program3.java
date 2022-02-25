/*
Write a program which accept string from user and accept one 
character. Return index of first occurrence of that character.
Input : “Marvellous Multi OS”
M
Output : 0
Input : “Marvellous Multi OS”
W
Output : -1
Input : “Marvellous Multi OS”
e
Output : 4
*/

import java.util.*;

class Program3 
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		//obj.Display();
		int iRet = obj.FirstOccChar();

		System.out.println("Count of Char first O. : "+iRet);
	}
}

class StringX
{
	public String str1,str2;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String :");
		str1 = sobj.nextLine();
	}
	public void Accept2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter check Character : ");
		str2 = scan.nextLine();
	}
	public void Display()
	{
		System.out.println("String is : "+str1+str2);
	}
}

class Lucifer extends StringX 
{
	public int FirstOccChar()
	{
		int iCnt = 0;
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();
		
		char ch = str2.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] != ch)
			{
				iCnt++;
				return -1;
			}
		}
		return iCnt;
	}
}