/*
Write a program which accept string from user and check whether 
it contains vowels in it or not.
Input : “marvellous”
Output : TRUE
Input : “Demo”
Output : TRUE
Input : “xyz”
Output : FALSE
*/

import java.util.*;

class Program4
{
	public static void main(String[] arg)
	{
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		System.out.println("check Vowel Present or Not");
		boolean bRet = obj.CheckVowel();
		if(bRet == true){
			System.out.println("Vowel is Present");
		}
		else{
			System.out.println("Not Vowel Present in String");
		}
	}
}

class StringX
{
	public String str;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is : "+str);
	}
}

class Lucifer extends StringX 
{
	public boolean CheckVowel()
	{
		int iCnt = 0;
		boolean bAns = false;
		char Arr[] = str.toCharArray();
		
		char ch = str.charAt(0);
		for(int i = 0; i < Arr.length; i++)
		{
			if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='u')||(Arr[i]=='o'))
			{
			  	bAns = true;
			}
		}
		return bAns;
	}
}