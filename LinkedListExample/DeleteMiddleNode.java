/*
 * Question: Delete middle node, write an algorithm to delete a node in the middle of the LinkedList?
 */
package LinkedListExample;

public class DeleteMiddleNode {
	
	private static void removeMiddleNode(Node middle) {
		if(middle == null) return;
		middle.data = middle.next.data;
		middle.next = middle.next.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);	
			
		Node b = a;
		b=a.next.next.next;
		removeMiddleNode(b);
		while(a!=null) {
			System.out.print(a.data + " ");
			a=a.next;
		}
		
	}

}
