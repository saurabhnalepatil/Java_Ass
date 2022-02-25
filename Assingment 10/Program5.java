/*
Accept number of rows and number of columns from user and display 
below pattern.
Input : iRow = 3 iCol = 4
Output : 
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
Program Layout :
*/
import java.util.*;

class Program5
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
			for(int j = 1; j <= iCol; j++)
			{
				System.out.print(" "+i);
			}
			System.out.println(" ");
		}
	}
}