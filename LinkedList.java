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

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			
		}else {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
