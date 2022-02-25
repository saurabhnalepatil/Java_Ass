/*
Write a program which accepts file name from user and count number of 
capital characters from that file.
Input : Demo.txt
Output : Number of capital characters are 23
*/

import java.io.FileReader;

class Main
{
	public static void main(String[] args)
	{
		int iCnt = 0;
		char[] Arr = new char[1024];
		try
		{
			FileReader input = new FileReader("output.txt");

			input.read(Arr);
			
			//char Arr[] = array.toCharArray();
			
			for(int i = 0; i < Arr.length; i++)
			{
				if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
				{
					
					iCnt++;
				}
			}
			System.out.println("Count of Capital later in File : " +iCnt);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}