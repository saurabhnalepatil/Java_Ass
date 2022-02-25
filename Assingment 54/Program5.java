/*
Write Java program which accept array from user and display below 
pattern.
Input : 8 9 7 6 4 2 4
Output :
* * * * * * * *
* * * * * *
* * * *
* *
* * * *
*/

import java.util.*;

class Program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the lenght of Array");
        int iLen = sobj.nextInt();

        Lucifer obj = new Lucifer(iLen);
        obj.AcceptArr();
        obj.DisPattern();
    }
}

class ArrayX
{
    public int Arr[];

    public ArrayX(int size)
    {
        Arr = new int [size];
    }
    public void AcceptArr()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Elements of Array");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = scan.nextInt();
        }
    }
}

class Lucifer extends ArrayX
{
    public Lucifer(int value)
    {
        super(value);   
    }
    public void DisPattern()
    {
        System.out.println("Your required pattern is");
        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0){
                while(Arr[i] != 0){
                    System.out.print(" *");
                    Arr[i]--;
                }
                System.out.println("");
            }
        }
    }
}