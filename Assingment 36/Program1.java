/*
Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
		A B C D
	    A B C D
	    A B C D
	    A B C D
Program Layout : 
*/

import java.util.*;

class Program1
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

public class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		char ch = '\0'; int  j = 0;
		System.out.println("Pattern is : ");
		for(int i = 0; i < iRow; i++)
		{
			for(j = 0, ch = 'A'; j < iCol; ch++,j++)
			{
				System.out.print( ch+" ");
			}
			System.out.println();
		}	
	}
}