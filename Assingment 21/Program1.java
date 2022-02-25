/*
Write a program which displays ASCII table. Table contains symbol, 
Decimal, Hexadecimal and Octal representation of every member from 
0 to 255.
*/

import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int decimal = 0;
		int octal = 0;
		int hexadecimal = 0;

		System.out.println(" ASCII Table Print : ");

		System.out.println(" Decimal  Octal   Hexadeciamal    ");

		//Lucifer obj = new Lucifer();
		//obj.DisplayASCII();

		for(int i = 1 ; i < 255; i++)
		{
			System.out.println("      "+(char)i+"      "+(hexa)X+"      "+i);
		}
	}
}
/*
class Lucifer
{
	public void DisplayASCII()
	{
		DisplayASCII();
	}
}
*/