/*
Accept number of rows and number of columns from user and display 
below pattern.
Input : iRow = 3 iCol = 5
Output : 
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
Program Layout : 
*/

import java.util.*;

class Program3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Rows number:");
		int value1 = scan.nextInt();

		System.out.println("Enter the Columns number:");
		int value2 = scan.nextInt();

		Lucifer obj = new Lucifer();
		obj.Pattern(value1,value2);
	}
}

class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
	
		for(int i = 1; i <= iRow; i++)
		{
			for(int j = iCol; j >= 1; j--)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}
}