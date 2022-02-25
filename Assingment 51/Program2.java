/*
Write Java program which accept two arrays from user and display 
even contents of each array.
Input : 2 9 6 5 2 3
45 6 12 18 23 4
Output : 2 6 2
6 12 18 4
*/

import java.util.*;

class Program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Array of Number:->");
        int iLen1 = sobj.nextInt();
        System.out.println("Enter Second Array of Number:->");
        int iLen2 = sobj.nextInt();

        Lucifer obj = new Lucifer(iLen1,iLen2);
        obj.Accept1();
        obj.Accept2();
        obj.EvenDis1();
        obj.EvenDis2();
    }
}

class ArrayX
{
    public int Arr1[],Arr2[];
    
    public ArrayX(int iSize1,int iSize2)
    {
        Arr1 = new int [iSize1];
        Arr2 = new int [iSize2];
    }
    public void Accept1()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first Array "+Arr1.length+" Elements:-> ");
        for(int iCnt = 0; iCnt < Arr1.length;iCnt++)
        {
            Arr1[iCnt] = sobj.nextInt();
        }
    }
    public void Accept2()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Second Array "+Arr2.length+" Elements:-> ");
        for(int iCnt = 0; iCnt < Arr2.length;iCnt++)
        {
            Arr2[iCnt] = sobj.nextInt();
        }
    }
}

class Lucifer extends ArrayX
{
    public Lucifer(int iValue1,int iValue2)
    {
        super(iValue1,iValue2);
    }
    public void EvenDis1()
    {
        System.out.println("Even element in first Array:->");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            if((Arr1[iCnt] % 2)== 0){
                 System.out.print(Arr1[iCnt]+"\t");
            }
        }
    }
    public void EvenDis2()
    {
        System.out.println("\nEven Element in second Array:->");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
           if((Arr2[iCnt] % 2)== 0){
                 System.out.print(Arr2[iCnt]+"\t");
            }
        }
    }
}
