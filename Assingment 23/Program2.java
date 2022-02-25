/*
Write a program which accept string from user and convert it into 
upper case.
Input : “Marvellous Multi OS”
Output : MARVELLOUS MULTI OS 
*/

import java.util.*;

class Program2
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		obj.CapitalConvert();

		//System.out.println("Conver to Lower case to Upper Case :"+str);
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX 
{
	public void CapitalConvert()
	{
		//System.out.println(str.toUpperCase());            Inbuild Function
		char Arr[] = str.toCharArray();
		
		//char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
			  	Arr[i] = (char)(Arr[i] + 'A' - 'a');
			  	System.out.print(Arr[i]);
			}
			else {
				System.out.print(Arr[i]);
			}
		}
		//return String.valueOf(Arr);*/
	}
}