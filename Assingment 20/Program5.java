/*
Accept division of student from user and depends on the division 
display exam timing. There are 4 divisions in school as A,B,C,D. Exam 
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM. 
(Application should be case insensitive)
Input : C
Output : Your exam at 9.20 AM
Input : d
Output : Your exam at 10.30 AM
*/

import java.util.*;

class Program5s
{
	public static void main(String[] arg)
	{
	    char a,b,c,d,H;
		Lucifer obj = new Lucifer();
		obj.Accept();
		obj.Display();
		H = obj.ExamTime();
		
		if(H == a){
			System.out.println("Your exam at 7 AM");
		}
		else if(H == b){
			System.out.println("Your exam at 8.30 AM");
		}
		else if(H == c){
			System.out.println("Your exam at 9.20 AM");
		}
		else if(H == d){
			System.out.println("Your exam at 10.30 AM");
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
	public String ExamTime()
	{
		char Arr[] = str.toCharArray();
		char G,a,b,c,d;
		char ch = str.charAt(0);
		if((ch >= 'a') && (ch <= 'd'))
		{
			if(ch == a){
				G = a;
			}
			else if(ch == b){
				G = b;
			}
			else if(ch == c){
				G = c;
			}
			else if(ch == d){
				G = d;
			}
		}

		return G;
	}
}
