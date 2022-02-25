/*Write a program which accept string from user and accept one 
character. Check whether that character is present in string or not.
Input : “Marvellous Multi OS”
e
Output : TRUE
Input : “Marvellous Multi OS”
W
Output : FALSE
*/

import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		obj.Display();
		bRet = obj.CheckChar();

		if(bRet == true)
		{
			System.out.println("Your Character is Present");
		}
		else{
			System.out.println("Your Character is Absent");
		}
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
	public boolean CheckChar()
	{
		boolean bAns = false;
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();
		
		char ch = str2.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == ch)
			{
				bAns = true;
			}
		return bAns;
	}
}