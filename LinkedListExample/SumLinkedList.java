/**
 * Question: Sum of LinkedList to make another LinkedList?
 */
package LinkedListExample;

public class SumLinkedList {
	
	private static void Nodeadd(Node a, Node b) {
		Node result = new Node();
		int carry = 0;
		while(a.next!=null) {
			int temp = a.data + b.data;
			result.add((temp%10)+carry);
			carry = temp/10;
			a = a.next;
			b = b.next;
		}
		System.out.println(result.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node();
		Node b = new Node();
		
		a.add(7);
		a.add(1);
		a.add(6);
		
		b.add(5);
		b.add(9);
		b.add(2);
		Nodeadd(a,b);
	}

}
