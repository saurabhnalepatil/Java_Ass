/*
Write a program which accept string from user and return 
difference between frequency of small characters and frequency of 
capital characters.
Input : “MarvellouS”
Output : 6 (8-2)
*/

import java.util.*;

class Program3
{
    public static void main(String[] arg)
    {
        Lucifer obj = new Lucifer();
        obj.Accept();
        obj.Display();
        int iRet = obj.Differnce();

        System.out.println("Differnce between Capital and Small Later :"+iRet);
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
    public int Differnce()
    {
        int iCnt = 0,jCnt = 0,iDiff = 0;
        char Arr[] = str.toCharArray();
        
        char ch = str.charAt(0);
        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCnt++;
            }
            else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                jCnt++;
            }
        }
        iDiff = iCnt - jCnt;
        return iDiff;
    }
}