/*
Write java program which accept marks of N students from user 
and display class of each student.
Less than 35 - Fail
Less than 50 - Pass class
Less than 60 - Second class
Less than 70 - First class
Greater than 70 - First class with Distinction
Input : 67.3 45.8 88.9 77.5 55.2
Output : 67.3 First class
		 45.8 Pass class
		 88.9 First class with Distinction
		 77.5 First class with Distinction
		 55.2 Second class
*/

import java.util.*;

class Program4
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the total Student name list length:->");
		int iLen = sobj.nextInt();

		Lucifer obj = new Lucifer(iLen);
		obj.AcceptArr();
		obj.DisResult();
	}
}

class ArrayX
{
	public float Arr[];

	public ArrayX(int size)
	{
		Arr = new int [size];
	}
	public void AcceptArr()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Student Marks;->");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = scan.nextFloat();
		}
	}
}

class Lucifer extends ArrayX
{
	public Lucifer(int value)
	{
		super(value);
	}
	public void DisResult()
	{
		System.out.println("Student Progres Rank List:->");
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] <= 35){
				System.out.println(Arr[i]+"-> Fail");
			}
			else if((Arr[i] >= 35)&&(Arr[i] <= 50)){
				System.out.println(Arr[i]+"-> Pass Class");
			}
			else if((Arr[i] >= 50)&&(Arr[i] <= 60)){
				System.out.println(Arr[i]+"-> Second Class");
			}
			else if((Arr[i] >= 60)&&(Arr[i] <= 70)){
				System.out.println(Arr[i]+"-> First Class");
			}
			else if(Arr[i] > 70){
				System.out.println(Arr[i]+"-> First class with Distinction");
			}
		}
	}
}