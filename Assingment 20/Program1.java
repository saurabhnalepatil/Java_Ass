/*
Accept Character from user and check whether it is alphabet or not 
(A-Z a-z).
Input : F
Output : TRUE
Input : &
Output : FALSE
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		bRet = obj.CheckAlpa();

		if(bRet == true)
		{
			System.out.println("It's alphabet");
		}
		else
		{
			System.out.println("It's NOT alphabet");
		}
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Character :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX 
{
	public boolean CheckAlpa()
	{
		char Arr[] = str.toCharArray();
		int i = 0;
		boolean bAns = false;

		char ch = str.charAt(i);
		if((ch >= 'A') && (ch <= 'Z'))
		{
			bAns = true;
		}
		else if((ch >= 'a') && (ch <= 'z'))
		{
			bAns = true;
		}
		return bAns;
	}
}

