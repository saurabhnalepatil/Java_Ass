/*
Write a java program which accepts 2 strings from user and 
concat N characters of second string after first string.Value of N 
should be accepted from user.
Note : If third parameter is greater than the size of second string 
then concat whole string after first string.
Input : “Marvellous Infosystems”
“Logic Building”
5
Output : “Marvellous Infosystems Logic”
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		obj.Display();
		obj.StrCopyCap();
	}
}

class StringX
{
	public String str1,str2;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First String : ");
		str1 = sobj.nextLine();
	}
	public void Accept2()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Second String : ");
		str2 = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("join to String :");
	}
}

class Lucifer extends StringX
{
	public void StrCopyCap()
	{
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]);
		}
		System.out.print(" ");
		for(int j = 0; j < Brr.length; j++)
		{
			System.out.print(Brr[j]);
		}
	}
}