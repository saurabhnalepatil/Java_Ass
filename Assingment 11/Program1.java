/* 
 Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 4 iCol = 4
Output : A B C D
A B C D
A B C D
A B C D
Program Layout :
*/

import java.util.*;

class Program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Column : ");
        iValue2 = sobj.nextInt();

        Lucifer mobj = new Lucifer();

        mobj.Pattern(iValue1,iValue2);
    }
}

class Lucifer
{
    public void Pattern(int iRow, int iCol)
    {
        char ch = '\0';
        int j = 0 , i = 0;
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1,ch = 'A'; j <= iCol;ch++, j++)
            {
                System.out.print(" "+ch);
            }
            System.out.println(" ");
        }
    }
}