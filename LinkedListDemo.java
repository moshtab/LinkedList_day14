package day14_LinkedList;

import day14_LinkedList.LinkedList.Node;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("Welcom to Linked List program");

		LinkedList list = new LinkedList();

		list.head = new Node(56);
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);

		// linking first node to secondNode
		list.head.next = secondNode;
		// linking second node to third node
		secondNode.next = thirdNode;
		list.printList();

	}

}
