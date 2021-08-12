package day14_LinkedList;

import java.util.Arrays;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Welcom to Linked List program");

		LinkedList list = new LinkedList();

		list.append(56);

		list.append(30);

		list.append(70);


		// printing the keys of nodes
		list.printList();
		System.out.println(); {
			
		}

		
		
		//deleting last node
		list.deleteLastNode(list.head);
		list.printList();
		

	}

}
