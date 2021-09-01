package LinkedListExample;

public class ReferenceMeet {
	private static int lengthTail(Node a, Node b) {
		int countA = 0, countB = 0;
		while(a.next!=null) {
			countA++;
			a=a.next;
		}
		while(b.next!=null) {
			countB++;
			b=b.next;
		}
		if(a.next == b.next)
			return (countA-countB);
		else
			return -1;
	}
	private static Node checkReference(Node a, Node b) {
		int length = lengthTail(a,b);

		if(length == -1) {
			Node temp = new Node(0);
			return temp;
		}
		if(length > 0) {
			while(length!=0) {
				length--;
				a=a.next;
			}
		}
		if(length < 0) {
			while(length!=0) {
				length++;
				b=b.next;
			}
		}
		while(a.next!=b.next) {
			a=a.next;
			b=b.next;
		}
		Node c = a.next;
		return c;
		
	}
	public static void main(String[] args) {


	}

}
