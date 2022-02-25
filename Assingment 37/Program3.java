/*
Write Java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 5 4 3 2 1
		 5 4 3 2 1
		 5 4 3 2 1
Program Layout :
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
		int i = 0, j = 0,iCnt;

		System.out.println("Pattern is : ");
		for(i = 0 ; i < iRow ; i++)
		{
			for(j = iCol , iCnt = iCol; j >= 1 ;iCnt--, j--)
			{
				System.out.print(" "+iCnt);
			}
			System.out.println("");
		}
	}
}