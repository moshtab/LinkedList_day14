package day14_LinkedList;

import day14_LinkedList.LinkedList.Node;

interface IlinkedList {

	void append(int data);

	Node deleteLastNode(Node head);

	void printList();

}

class LinkedList implements IlinkedList {
	Node head;

	// i have made Node class static because to access to main
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// Method for adding the elements of list
	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node newNode = new Node(data);
		newNode.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = newNode;
	}

	public Node deleteLastNode(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node secondLast = head;
		while (secondLast.next.next != null)
			secondLast = secondLast.next;
		secondLast.next = null;

		return head;

	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
