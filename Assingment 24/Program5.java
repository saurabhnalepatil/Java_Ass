/*
Write a program which accept string from user reverse that string 
in place.
Input : “abcd”
Output : “dcba”
Input : “abba”
Output : “abba”
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		//obj.Accept2();
		//obj.Display();
		
		String sRet = obj.RevStrX();
		System.out.println("Reverse String is : "+sRet);
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
	public String RevStrX()
	{
		char Arr[] = str1.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char iTemp;

			while(iStart < iEnd)
			{
				char ch = str1.charAt(iStart);
				iTemp = Arr[iStart];
				Arr[iStart] = Arr[iEnd];
				Arr[iEnd] = iTemp;
				iStart++;
				iEnd--;
			}
	    return String.valueOf(Arr);
	}
}