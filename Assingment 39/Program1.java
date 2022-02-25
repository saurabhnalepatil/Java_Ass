/*
Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output : H * * * *
		 H e * * *
		 H e l * *
		 H e l l *
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
		for(int i = 0; i < len; i++)
		{
			for(int j = 0 ; j < len; j++)
			{
				char ch = str.charAt(j);
		
				if(i < j)
				{
					System.out.print(" *");
				}
				else
				{
					if(i == len - 1)
					{
						System.out.println(" ");
						break;
					}
					System.out.print(" "+ch);
				}
			}	
			System.out.println("");
		}
	}
}