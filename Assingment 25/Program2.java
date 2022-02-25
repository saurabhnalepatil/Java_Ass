/*
Write a program which accept string from user and copy the 
contents of that string into another string. (Implement strncpy() 
function)
Input : “Marvellous Multi OS”
10
Output : “Marvellous
Note : If third parameter is greater than the size of source string then 
copy whole string into destination.
*/


import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		obj.Display();
		obj.StrCopy();
	}
}

class StringX
{
	public String str;
	public int iCnt;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sobj.nextLine();
	}
	public void Accept2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to print a String Char. : ");
		iCnt = scan.nextInt();

	}
	public void Display()
	{
		System.out.println("String is : ");
	}
}

class Lucifer extends StringX
{
	public void StrCopy()
	{
		int j = 0;
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			System.out.print(Arr[i]);
			j++;
			if(j == iCnt){
				break;
			}
		}
	}
}