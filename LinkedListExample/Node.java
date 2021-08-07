package LinkedListExample;

public class Node {
	Node next = null;
	int data;

	public Node(int d) {
		// TODO Auto-generated constructor stub
		this.data = d;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public void add(int d) {
		Node end = new Node(d); 
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

}
