/*
Write a program which accept string from user and copy that 
characters of that string into another string by converting all capital 
characters into small case.
Input : “Marvellous Python 2”
Output : “marvellous python 2”
*/
import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.StrCpySmall();
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
		System.out.println("String Copy to Another String Convert Small Later : ");
	}
}

class Lucifer extends StringX
{
	public void StrCpySmall()
	{
		char Arr[] = str.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z')){
				Arr[i] = (char)(Arr[i] + 'a' - 'A');
				System.out.print(Arr[i]);
			}
			else{
				System.out.print(Arr[i]);
			}
		}
	}
}