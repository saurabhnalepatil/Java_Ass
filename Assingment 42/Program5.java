/*
Write a program which accepts file name and one count from user and read 
that number of characters from starting position.
Input : Demo.txt 12
Output : Display first 12 characters from Demo.txt
*/

import java.io.FileReader;

class Main
{
	public static void main(String[] args)
	{
		int iCnt = 0,no = 7;
		char[] Arr = new char[1024];
		try
		{
			FileReader input = new FileReader("output.txt");

			input.read(Arr);
			
			//char Arr[] = array.toCharArray();
			
			for(int i = 0; i < Arr.length; i++)
			{
				if(iCnt == no){
					break;
				}
					System.out.print(Arr[i]);
					iCnt++;
			}
			//System.out.println("Count of Capital later in File : " +iCnt);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}