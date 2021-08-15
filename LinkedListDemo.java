package day14_LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Welcom to Linked List program");

		LinkedList list = new LinkedList();

		list.append(56);

		list.append(30);

		list.append(70);

		
		list.printList();
		System.out.println();
		
		// Searching the element
		if (list.search(list.head, 30))
			System.out.printf("Yes %s is present",30);
		else
			System.out.println("No element matching");

	}

}
