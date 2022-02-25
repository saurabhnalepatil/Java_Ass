/*
Write a program which accept string from user and copy the 
contents of that string into another string. (Implement strcpy() 
function)
Input : “Marvellous Multi OS”
Output : “Marvellous Multi OS”
*/


import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.StrCopy();
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
		System.out.println("String Copy to anthor String : ");
	}
}

class Lucifer extends StringX
{
	public void StrCopy()
	{
		String prt;
		str = ptr;
		char Arr[] = ptr.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]);
		}
	}
}