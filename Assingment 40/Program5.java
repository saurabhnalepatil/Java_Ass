/*
Write a java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 1 2 3 4 5
		 1 2 	 5
		 1   3   5
		 1     4 5
		 1 2 3 4 5
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
		int iCnt = 0, i;

		System.out.println("Pattern is : ");
		for(i = 0,iCnt = 1; i < iRow;iCnt++,i++)
		{
			for(int j = 0; j < iCol; j++)
			{

				if((i==iRow-1)||(j==iCol-1)||(i==0)||(j==0)||(i==j))
				{
					System.out.print(" "+iCnt);
				}
				else
				{
					System.out.print("  "); 
				}	
			}
			System.out.println("");
		}
	}
}
