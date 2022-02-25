
/*
Accept number of rows and number of columns from user and display 
below pattern.
Input : iRow = 4 iCol = 3
Output : 1 2 3
1 2 3
1 2 3
1 2 3
Program Layout : 
*/

import java.util.*;

class Program2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0, iValue2 = 0;

		System.out.println("Enter Number of Row and Column : ");
		iValue = sobj.nextInt();
		iValue2 = sobj.nextInt();

		Lucifer obj = new Lucifer();

		obj.Pattern(iValue,iValue2);
	}
}

class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		int i = 0 , j = 0;
		int n = '\0';

		for(i = 1 ; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}	
	}
}