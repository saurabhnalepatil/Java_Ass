/*
Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 3 iCol = 4
Output : 
1 2 3 4
5 6 7 8
9 10 11 12
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
		int iCnt = 1;
		for(int i = 0; i < iRow; i++)
		{
			for(int j = 0; j < iCol; j++)
			{
				System.out.print(" "+iCnt);
				iCnt++;
			}
			System.out.println(" ");
		}
	}
}