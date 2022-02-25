/*
Accept character from user. If it is capital then display all the 
characters from the input characters till Z. If input character is small 
then print all the characters in reverse order till a. In other cases 
return directly.
Input : Q
Output : Q R S T U V W X Y Z
Input : m
Output : m l k j i h g f e d c b a
Input : 8
Output :
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
	}
}

class StringX 
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the String :");
		str = sobj.nextLine();
	}
}

class Lucifer extends StringX 
{
	public void Display()
	{
		int i = 0;
		char Arr[] = str.toCharArray();

		while(i < Arr.length)
		{
			char ch = str.charAt(i);
			if((ch >= 'A') && (ch <= 'Z'))
			{
				while(ch <= 'Z')
				{
					System.out.print(" "+ch);
					ch++;
					if(ch == 'Z'+1)
					return ;
				}
			}
			if((ch >= 'a') && (ch <= 'z'))
			{
				while(ch >= 'a')
				{
					System.out.print(" "+ch);
					ch--;
					if(ch == 'a'-1)
					return;
				}
			}
		}
 	}
}