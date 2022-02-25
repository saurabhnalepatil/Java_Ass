/*
Write a program which reverse each element of singly linked list. 
Function Prototype :
void Reverse( PNODE Head); 
Input linked list : |11|->|28|->|17|->|41|->|6|->|89| 
Output : |11|->|82|->|71|->|14|->|6|->|98|
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
	public void RevNo()
	{
		Node tnode = head;
		int iDigit = 0;
		while(tnode != null)
		{
			int temp = tnode.data;
			System.out.print("|");
			while(tnode.data != 0)
			{
				iDigit = tnode.data % 10;
				System.out.print(iDigit);
				tnode.data = tnode.data / 10;
			}
			//System.out.print("|"+temp+"|-> Reverse in no is : "+iMult+"\n");
			tnode = tnode.next;
			System.out.print("|-> ");
		}	
	}

	public static void main(String[] args)	
	{
		LinkedList obj = new LinkedList();

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of element in Linkedlist :");
		int no = sobj.nextInt();
		System.out.println("Created Linked list is :"+no +"->\n"); 
		
		for(int i = 1; i <= no; i++)
		{
			System.out.println("Enter the element :"+i +"->");
			int value = sobj.nextInt();
			obj.InsertLast(value);
		}
		System.out.println("\nCreated Linked list is :");
		obj.printList();

		System.out.println("\nReverse in Ele. number is LinkedList :");
		obj.RevNo();	
	}
}