/*
Accept N numbers from user and display summation of digits of each 
number.
Input : N : 6
Elements :8225 665 3 76 953 858
Output : 17 17 3 13 17 21
Program Layout : 
*/

import java.util.*;

class Program5
{
    public static void main(String[] arg)
    {
        Scanner sobj = new Scanner(System.in);
        int iLenght = 0;

        System.out.println("Enter the number of Elements :");
        iLenght = sobj.nextInt();

        Lucifer obj = new Lucifer(iLenght);
        obj.Accept();

        System.out.println("Addition of Digit in a Hole Number :");
        obj.DigitSum();
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

        System.out.println("Enter "+Arr.length+" Elements : ");
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
    public void DigitSum()
    {
        int iSum = 0, iDigit = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            while(Arr[iCnt]  != 0)
            {
                iDigit = Arr[iCnt] % 10;
                iSum = iSum + iDigit;
                Arr[iCnt] = Arr[iCnt] / 10;
            }
            System.out.println(iSum);
            iSum = 0;
        }
    }
}