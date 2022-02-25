/*
Write Java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 1 1 1 1
		 2 2 2 2
		 3 3 3 3
		 4 4 4 4
Program Layout : 
*/

import java.util.*;

class Program5
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
	

		System.out.println("Pattern is : ");
		for(int i = 0,iCnt = 1; i < iRow;iCnt++, i++)
		{
			for(int j = 0; j < iCol; j++)
			{
				System.out.print(" "+iCnt);
			}
			System.out.println("");
		}
	}
}