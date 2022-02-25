/*
Write a program which 2 strings from user and concat second string 
after first string. (Implement strcat() function).
Input : “Marvellous Infosystems”
“Logic Building”
Output : “Marvellous Infosystems Logic Building”
*/
import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		obj.Display();
		obj.StrCopyCap();
	}
}

class StringX
{
	public String str1,str2;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First String : ");
		str1 = sobj.nextLine();
	}
	public void Accept2()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Second String : ");
		str2 = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("Join to String  : ");
	}
}

class Lucifer extends StringX
{
	public void StrCopyCap()
	{
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]);
		}
		System.out.print(" ");
		for(int j = 0; j < Brr.length; j++)
		{
			System.out.print(Brr[j]);
		}
	}
}