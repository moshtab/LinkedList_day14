package day14_LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Welcom to Linked List program");

		LinkedList list = new LinkedList();

		list.append(56);

		list.append(30);

		list.append(70);

		list.insertAfter(list.head.next, 40);

		list.printList();

	}

}
