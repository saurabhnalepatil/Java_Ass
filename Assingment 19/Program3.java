/*Accept N numbers from user and return the difference between largest 
and smallest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 90 (93 -3)
Program Layout :
*/

import java.util.*;

class Program3
{
	public static void main(String[] arg)
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;

		System.out.println("Enter the number of Ele : ");
		iLength = sobj.nextInt();

		Lucifer obj = new Lucifer(iLength);
		obj.Accept();

		iRet = obj.DiffLarSmall();

		System.out.println("Differnce between Large & Small No : "+iRet);
	}
}

class ArrayX
{
	public int Arr[];

	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter "+Arr.length+" elements : ");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int iValue)
	{
		super(iValue);
	}
	public int DiffLarSmall()
	{
		int iMax = 0, iMin = 0, iDiff = 0, iCnt = 0;

		iMax = iMin = Arr[iCnt];

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			if(Arr[iCnt] < iMin)
			{
				iMin = Arr[iCnt];
			}
			else if(Arr[iCnt] > iMax)
			{
				iMax = Arr[iCnt];
			}
		}
		iDiff = iMax - iMin;
		return iDiff;
	}
} 