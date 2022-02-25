/*
Write a program which accept string from user and copy capital 
characters of that string into another string.
Input : “Marvellous Multi OS”
Output : “MMOS”
*/


import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.StrCopyCap();
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
		System.out.println("String Copy Capital Later : ");
	}
}

class Lucifer extends StringX
{
	public void StrCopyCap()
	{
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z')){
				System.out.print(Arr[i]);
			}
		}
	}
}