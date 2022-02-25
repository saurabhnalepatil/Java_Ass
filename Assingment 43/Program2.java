/*
Write a program which displays all elements which are prime from singly 
linear linked list. 
Function Prototype :
int DisplayPrime( PNODE Head); 
Input linked list : |11|->|20|->|17|->|41|->|22|->|89| 
Output : 11 17 41 89
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
	public void PrimeNo()
	{
		Node tnode = head;

		while(tnode != null)
		{
			if((tnode.data % 2) !=0){
				System.out.println(tnode.data);
			}
			tnode = tnode.next;
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

		System.out.println("\nPrime No. Ele. in LinkedList :");
		obj.PrimeNo();	
	}
}