/*
Accept Character from user and check whether it is small case or 
not (a-z).
Input : g
Output : TRUE
Input : D
Output : FALSE
*/
import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		boolean bRet = false;
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		bRet = obj.SmallAlpa();
		
		if(bRet == true)
		{
			System.out.println("It's Small later Character");
		}
		else{
			System.out.println("It's Not Small later Character");
		}
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String : ");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX
{
	public boolean SmallAlpa()
	{
		char Arr[] = str.toCharArray();
		boolean bAns = false;
		char ch = str.charAt(0);
		if((ch >= 'a') && (ch <= 'z'))
		{
			bAns = true;
		}
		return bAns;
	}
}
