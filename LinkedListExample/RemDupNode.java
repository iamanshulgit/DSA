package LinkedListExample;
import java.util.*;
public class RemDupNode {
	
	public static void solution(Node n) {
		List<Integer> table = new ArrayList<Integer>();
		Node prev = null;
		while(n!=null) {
			if(table.contains(n.data)) {
				prev.next = n.next;
			}
			else {
				table.add(n.data);
				prev=n;
			}
			n=n.next;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(6);
		n.add(1);
		n.add(2);
		n.add(1);
		n.add(1);
		n.add(3);
		n.add(4);
		
		Node show = n;
		
		while(show!=null) {
			System.out.println(show.data);
			show=show.next;
		}
		solution(n);
		System.out.println();
		while(n!=null) {
			System.out.print(n.data);
			n=n.next;
		}
	}

}
