/*
Accept character from user. If character is small display its 
corresponding capital character, and if it small then display its 
corresponding capital. In other cases display as it is.
Input : Q
Output : q
Input : m
Output : M
Input : 4
Output : 4
Input : %
Output : %
*/

import java.util.*;

class Program2
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

		System.out.println("Enter the Character :");
		str = sobj.nextLine();
	}
}

class Lucifer extends StringX
{
	public void Display()
	{
		int ascii = 0;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		if((ch >= 'A') && (ch <= 'Z'))
		{
			ascii = ch;
			ascii = ascii + 32;
			ch = (char)ascii;
			System.out.print("Uppercase to Lowercase Alphabet : "+ch);
			return;
		}
		else if((ch >= 'a') && (ch <= 'z'))
		{
			ascii = ch;
			ascii = ascii - 32;
			ch = (char)ascii;
			System.out.print("Lowercase to Uppercase Alphabet : "+ch);
			return;
		}
		else{
			System.out.println("Not Convert a Character : "+ch);
		}
	}
}


/////////////////////////////////////////
//
//  Ascii = ChUPPER;
//	Ascii = Ascii + 32;
// chLOWER = (char)Ascii;
//
//////////////////////////////////////////
