/*
Write a program which search last occurrence of particular element from 
singly linear linked list. 
Function should return position at which element is found. 
Function Prototype :
int SearchLastOcc(); 
Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70| 
Input element : 30 
Output : 6 
*/
import java.util.*;

class LinkedList
{
	Node head; 
	int size;

	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}

	public void InsertLast(int new_data)
	{
		Node new_node = new Node(new_data);

		if (head == null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		size++;
		return;
	}
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print("|"+tnode.data+"|-> ");
			tnode = tnode.next;
		}
		System.out.println("");
	}
	public void IndexFind(int no)
	{
		/*Node tnode = head;
		int iCnt = 0,i = 0;

		while(tnode != null)
		{
			i++;
			if(tnode.data == no){
				break;
			}
			tnode = tnode.next;
		}
		iCnt = size - i;*/

	}

	public static void main(String[] args)	
	{
		LinkedList obj = new LinkedList();

		Scanner sobj = new Scanner(System.in);
		System.out.println("\nCreated Linked list is :>\n"); 

		//System.out.println("Insert Node Position node :");
		
		obj.InsertLast(10);
		obj.InsertLast(20);
		obj.InsertLast(30);
		obj.InsertLast(40);
		obj.InsertLast(50);
		obj.InsertLast(60);
		obj.InsertLast(30);
		obj.InsertLast(70);
		obj.printList();

		//System.out.println("\nEnter number that check to Index no:");
		//int value = sobj.nextInt();
		System.out.println("Last occurrence of Index no : "+ obj.LastIndexOf("30"));

		//obj.IndexFind(value);
	}
}


