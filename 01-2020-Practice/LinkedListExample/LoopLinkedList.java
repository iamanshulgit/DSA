package LinkedListExample;

public class LoopLinkedList {
	private static Node FindLoop(Node a) {
		Node s = a;
		Node f = a;
		while(f!=null && f.next!=null) {
			s = s.next;
			f = f.next.next;
			if(f == s)
				break;
		}
		
		if(f == s) {
			s = a;
			while(s != f) {
				s = s.next;
				f = f.next;
			}
			return f;
		}
		else return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
