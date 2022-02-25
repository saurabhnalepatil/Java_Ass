/*
Accept Character from user and check whether it is digit or not 
(0-9).
Input : 7
Output : TRUE
Input : d
Output : FALSE
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		bRet = obj.CheckDigit();
		
		if(bRet == true)
		{
			System.out.println("It's Digit");
		}
		else{
			System.out.println("It's Not Digit");
		}
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
	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX
{
	public boolean CheckDigit()
	{
		char Arr[] = str.toCharArray();
		boolean bAns = false;
		char ch = str.charAt(0);
		if((ch >= '0') && (ch <= '9'))
		{
			bAns = true;
		}
		return bAns;
	}
}
