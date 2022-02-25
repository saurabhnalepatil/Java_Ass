/*Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : H e l l o
		 H e l l
		 H e l
		 H e
		 H
		 H e
		 H e l
		 H e l l
		 H e l l o
Program Layout :
*/
import java.util.*;

class Program1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str ;

		System.out.println("Enter String is : ");
		str = sobj.nextLine();

		Lucifer obj = new Lucifer();
		obj.Pattern(str);
	}
}

class Lucifer
{
	public void Pattern(String str)
	{
		int  len = str.length();
		System.out.println("Pattern is : ");
		for(int i = len ; i >= 2 ; i--)
		{
			for(int j = 0 ; j < len; j++)
			{
				char ch = str.charAt(j);
				if(i > j)
				{
					System.out.print(" "+ch);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			if(i !=2)
			{
				System.out.println("");
			}	
		}
		for(int i = 0 ; i < len + 1; i++)
		{
			for(int j = 0 ; j < len; j++)
			{
				char ch = str.charAt(j);
				if(i > j)
				{
					System.out.print(" "+ch);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}