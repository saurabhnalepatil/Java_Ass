/*
Accept N numbers from user and return product of all odd elements.
Input : N : 6
Elements :15 66 3 70 10 88
Output : 45
Input : N : 6
Elements :44 66 72 70 10 88
Output : 0
Program Layout : 
*/
import java.util.*;

class Program5
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Elements of No.");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.Accept();
		int iRet = obj.MultArrEle();

		System.out.println("Product of Array Elements : "+iRet);
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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+Arr.length+" elements :");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = scan.nextInt();
		}
	}
}

class Lucifer extends ArrayX 
{
	public Lucifer(int iValue)
	{
		super(iValue);
	}
	public int MultArrEle()
	{
		int iMult = 1;
		for(int i = 0; i < Arr.length; i++)
		{
			iMult = iMult * Arr[i];
		}
		return iMult;
	}
}