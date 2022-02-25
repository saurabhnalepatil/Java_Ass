/*
Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 3 iCol = 5
Output : 
A A A A A
B B B B B
C C C C C

*/

import java.util.*;

class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue1 = 0, iValue2 = 0;

		System.out.println("Enter number of Row and Columns : ");
		iValue1 = sobj.nextInt();
		iValue2 = sobj.nextInt();

		Lucifer obj = new Lucifer();
		obj.Pattern(iValue1,iValue2);
	}
}


class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		int i , j;
		char ch;
		System.out.println("Pattern is : ");
		for(i = 0,ch = 'A'; i < iRow;ch++, i++)
		{
			for(j = 0; j < iCol; j++)
			{
				System.out.print(" "+ch);
			}
			System.out.println(" ");
		}
	}
}