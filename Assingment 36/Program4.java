/*
Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 4 iCol = 5
Output : 4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
Program Layout :
*/

import java.util.*;

class Program4
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
		int i = 0,iCnt = 0, j = 0;
		System.out.println("Pattern is : ");
		for(i = iRow,iCnt = iRow; i >= 1 ;iCnt--, i--)
		{
			for(j = 0; j < iCol; j++)
			{
				System.out.print( iCnt+" ");
			}
			System.out.println();
		}	
	}
}