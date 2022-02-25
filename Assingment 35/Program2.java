/*
Write a program which 2 strings from user and check whether 
contents of two strings are equal or not.
Input : “Marvellous Infosystems”
“Marvellous Infosystems”
Output : TRUE
*/
import java.util.*;

class Program1
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept1();
		obj.Accept2();
		obj.Display();
		bRet = obj.StrDemo();
		if(bRet == true){
			System.out.println("Both String is Match");
		}
		else{
			System.out.println("String is Different");
		}
	}
}

class StringX
{
	public String str1,str2;

	public void Accept1()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First String : ");
		str1 = sobj.nextLine();
	}
	public void Accept2()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Second String : ");
		str2 = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("Compaire two String :");
	}
}

class Lucifer extends StringX
{
	public boolean StrDemo()
	{
		boolean bAns = true;
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();

		for(int i = 0; i < Arr.length; i++)
		{
			for(int  j = 0; j < Brr.length; j++)
			{
				if(Arr[i] != Brr[j])
				{
					bAns = false;
				}
			}
		}
		return bAns;	
	}
}