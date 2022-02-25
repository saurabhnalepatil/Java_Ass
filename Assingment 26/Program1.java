/*
Write a program which accept string from user and copy that 
characters of that string into another string in reverse order.
Input : “Marvellous Python”
Output : “nohtyP suollevraM”
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.RevStrX();

		//System.out.println("Reverse String is : "+sRet);
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sobj.nextLine();
	}
}

class Lucifer extends StringX
{
	public void RevStrX()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length -1;
		char iTemp;
		while(iStart < iEnd)
		{
			iTemp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = iTemp;
			iStart++;
			iEnd--;
		}
		System.out.println("Reverse String is : "+String.valueOf(Arr));
	}
}