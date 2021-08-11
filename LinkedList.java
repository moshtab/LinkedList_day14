package day14_LinkedList;

class LinkedList {
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

	public void insertAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
	}

	public void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // changed head
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// If key was not present in linked list
		if (temp == null)
			return;
		// Unlink the node from linked list
		prev.next = temp.next;
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
