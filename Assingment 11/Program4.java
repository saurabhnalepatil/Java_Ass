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


class Lucifer
{
	public void Pattern(int iRow, int iCol)
	{
		int i , j,iCnt = 0;
		char ch;
		System.out.println("Pattern is : ");
		for(i = iRow , iCnt = iRow ; i > 0; iCnt--, i--)
		{
			for(j = 0; j < iCol; j++)
			{
				System.out.print(" "+iCnt);
			}
			System.out.println(" ");
		}
	}
}