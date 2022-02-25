/*
 Accept number of rows and number of columns from user and display below 
pattern.Input : iRow = 4 iCol = 4
Output : * * * *
		 * * * #
		 * * # #
		 * # # #
*/

import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue1 = 0, iValue2 = 0;

		System.out.println("Enter number of Row and Column : ");
		iValue1 = sobj.nextInt();
		iValue2 = sobj.nextInt();

		Lucifer obj = new  Lucifer();

		obj.Pattern(iValue1,iValue2);
	}
}

class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0; int j = 0;

		for(i = 1; i <= iRow; i++)
		{
			for(j = iCol; j >= 1; j--)
			{
				if(i == j)
				{
					System.out.print(" * ");
				}
				else if( i > j)
				{
					System.out.print(" # ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
	}
}