package day14_LinkedList;

import java.util.Arrays;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Welcom to Linked List program");

		LinkedList list = new LinkedList();

		list.append(56);

		list.append(30);

		list.append(70);

		// inserting 40 after 30
		list.insertAfter(list.head.next, 40);
                // printing the keys of nodes
		list.printList();

		// delete's the node with key 40
		list.deleteNode(40);
		System.out.println();
		list.printList();
		System.out.println();

		// Searching the key in nodes
		if (list.search(list.head, 30))
			System.out.printf("Yes %s is present", 30);
		else
			System.out.println("No element matching");
		System.out.println();

		// sorting
		int[] arr = { 56, 30, 40, 70 };
		Arrays.sort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

	}

}
