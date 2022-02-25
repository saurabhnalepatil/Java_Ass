/*
Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 4 iCol = 4
Output : A B C D
		 a b c d
		 A B C D
		 a b c d
Program Layout :
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

		Lucifer obj = new Lucifer();

		obj.Pattern(iValue1,iValue2);
	}
}

class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0, j = 0;
		char ch = '\0',chh = '\0';

		for(i = 1; i <= iRow; i++)
		{
			for(j = 1,ch = 'a', chh = 'A'; j <= iCol;ch++,chh++, j++)
			{
				if((i % 2) == 0)
				{
					System.out.print(" " +ch );
				}
				else
				{
					System.out.print(" " +chh );
			}
				}
			System.out.println(" ");
		}
	}
}