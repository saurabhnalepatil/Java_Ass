/*
Accept Character from user and check whether it is special symbol 
or not (!, @, #, $, %, ^, &, *).
Input : %
Output : TRUE
Input : d
Output : FALSE
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept();
		bRet = obj.Check();

		if(bRet == true)
		{
			System.out.println("It's special Character");
		}
		else
		{
			System.out.println("It's Not special Character");
		}
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Character : ");
		str = sobj.nextLine();
	}
}

class Lucifer extends StringX 
{
	public boolean Check()
	{
		boolean bAns = false;
		char Arr[] = str.toCharArray();
		char ch = str.charAt(0);

		if((ch >= '!') && (ch <= '*'))
		{
			bAns = true;
		}
		return bAns;
	}
}