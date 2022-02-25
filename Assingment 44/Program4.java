/*
Write a program which return largest element from singly linear linked 
list. 
Function Prototype :
int Maximum( PNODE Head); 
Input linked list : |110|->|230|->|320|->|240| 
Output : 320
*/

import java.util.*;
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

		if (head == null){
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
	public void Maximum()
	{
		Node tnode = head;
		int iMax = 0;
		while(tnode != null)
		{
			if(iMax < tnode.data){
				iMax = tnode.data;
			}
			tnode = tnode.next;
		}
		System.out.println("Largest Ele. in LinkedList is : "+ iMax);
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
		System.out.println("\nCreated Linked list is :\n");
		obj.printList();

		obj.Maximum();	
	}
}
