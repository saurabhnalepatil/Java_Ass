/*
Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 6 iCol = 6
Output : 
* * * * * *
*       * *
*     *   *
*   *     *
* *       *
* * * * * *
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
	
		for(int i = iRow; i >= 1; i--)
		{
			for(int j = 1; j <= iCol; j++)
			{
				if((i==j)||(i==1)||(i==iRow)||(j==iCol)||(j==1)){
					System.out.print(" *");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}