/*
Write a java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 
* * * #
* * # *
* # * * 
# * * *
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

class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
	

		System.out.println("Pattern is : ");
		for(int i = iRow -1; i >= 0; i--)
		{
			for(int j = 0; j < iCol; j++)
			{
				if(i == j)
				{
					System.out.print(" #");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	}
}