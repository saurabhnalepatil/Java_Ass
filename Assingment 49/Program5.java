/*
 Write a recursive program which accept number from user and return its 
product of digits. 
Input : 523
Output : 30
Prototype :
*/
import java.util.*;

class Program2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int value = scan.nextInt();

		Lucifer obj = new Lucifer();
		int iRet = obj.MultDigit(value);

		System.out.println("Summation in Digit is: "+iRet);
	}
}

class Lucifer
{
	static int iMult = 1;
	//Itration.....
	public int MultDigit(int iNo)
	{
		int iDigit = 0;
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iMult = iMult * iDigit;
			iNo = iNo / 10;
		}
		return iMult;
	}
	public int MultDigitR(int iNo)
	{
		int iDigit = 0;
		if(iNo == 0){
			return 0;
		}
		else{
			iDigit = iNo % 10;
			iMult = iMult * iDigit;
			iNo = iNo / 10;
			MultDigitR(iNo);
			return iMult;
		}
	}
}