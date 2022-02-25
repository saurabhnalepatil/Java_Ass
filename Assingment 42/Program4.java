/*
Write a program which accepts file name and one character from user and 
count number of occurrences of that characters from that file.
Input : Demo.txt ‘M’
Output : Frequency of M is 7
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
				if((Arr[i] == 'M'))
				{
					
					iCnt++;
				}
			}
			System.out.println("Count of M Freq. in File : " +iCnt);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}