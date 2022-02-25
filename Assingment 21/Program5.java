/*
Accept character from user and display its ASCII value in decimal, 
octal and hexadecimal format.
Input : A
Output : Decimal 65
Octal 0101
Hexadecimal 0X41
*/

import java.util.*;

class Program5
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		String str;
		System.out.println("Enter the Character : ");
		str = sobj.nextLine();

		Lucifer obj = new Lucifer();
		obj.Display(ch);
	}
}

class Lucifer
{
	public void Display(Stirng str)
	{
		char Arr[] = str.toCharArray();
		char ch = str.charAt(0);
		String dec = ch.toHexSting(ch);
		System.out.println(dec);
		//System.out.println();
		//System.out.println(%o);
	}
}