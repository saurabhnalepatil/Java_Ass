/*
Write a recursive program which accept string from user and count number 
of characters.
Input : Hello
Output : 5
Prototype :
*/

import java.util.*;

class Program3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = scan.nextLine();

		Lucifer obj = new Lucifer();
		int iRet = obj.StrLenR(str);

		System.out.println("Number of Character in String: "+iRet);
	}
}

class Lucifer
{
	public int StrLen(String str)
	{
		int iCnt = 0;
		char Arr[] = str.toCharArray();
		int size = Arr.length;
		while(size != 0)
		{
			iCnt++;
			size--;
		}
		return iCnt;
	}
//	Recurtion
	static int StrLenR(String str)
	{
		char Arr[] = str.toCharArray();
		return Arr.length;
	}
}