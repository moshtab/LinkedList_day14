package day14_LinkedList;

class LinkedList {
	Node head;
	

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}

}
