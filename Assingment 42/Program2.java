/*
Write a program which accepts file name from user and count number of 
small characters from that file.
Input : Demo.txt
Output : Number of small characters are 21
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
				if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
				{
					
					iCnt++;
				}
			}
			System.out.println("Count of Small later in File : " +iCnt);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}