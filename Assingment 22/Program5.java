/*
Write a program which accept string from user and display it inn 
reverse order.
Input : “MarvellouS”
Output : “SuollevraM”
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		String sRet = obj.RevStr();

		System.out.println("Reverse String is :"+sRet);
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
	public String RevStr()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char iTemp;
		
		while(iStart < iEnd)
		{
			char ch = str.charAt(iStart);
			iTemp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = iTemp;
			iStart++;
			iEnd--;
		}
		return String.valueOf(Arr);
	}
}