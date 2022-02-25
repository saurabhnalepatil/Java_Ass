/*
Write a program which accept string from user and copy that 
characters of that string into another string by toggling the case.
Input : “Marvellous Python 2”
Output : “mARVELLOUS pYTHON 2”
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.StrCpyToggle();
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
		System.out.println("String Copy to Another String Convert Toggle Later : ");
	}
}

class Lucifer extends StringX
{
	public void StrCpyToggle()
	{
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i] <= 'z')){
				Arr[i] = (char)(Arr[i] + 'A' - 'a');
				System.out.print(Arr[i]);
			}
			else if((Arr[i] >= 'A') && (Arr[i] <= 'Z')){
				Arr[i] = (char)(Arr[i] + 'a' - 'A');
				System.out.print(Arr[i]);
			}
			else{
				System.out.print(Arr[i]);
			}
		}
	}
}