/*
Accept Character from user and check whether it is capital or not 
(A-Z).
Input : F
Output : TRUE
Input : d
Output : FALSE
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept();
		bRet = obj.CheckCapital();

		if(bRet == true)
		{
			System.out.println("It's Capital Alphabet");
		}
		else
		{
			System.out.println("It's NOT Capital Alphabet");
		}
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter Check Character :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("You Enter Character :");
	}
}

class Lucifer extends StringX 
{
	public boolean CheckCapital()
	{
		boolean bAns = false;
		int i = 0;
		char Arr[] = str.toCharArray();

		char ch = str.charAt(i);
		if((ch >= 'A') && (ch <= 'Z'))
		{
			bAns = true;
		} 
		return bAns;
	}
}