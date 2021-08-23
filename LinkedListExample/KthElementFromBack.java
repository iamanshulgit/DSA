package LinkedListExample;

import java.util.*;
public class KthElementFromBack {
	//using extra space
	private static void solution1(Node a,int k) {
		if(a == null)
			return;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(a.next != null) {
			list.add(a.data);
			a = a.next;
		}
		list.add(a.data);
		System.out.println(list.get(list.size()-k));
	}
	//using recursive function
	private static int solution2(Node a, int k) {
		if(a==null)
			return 0;
		int i = solution2(a.next,k)+1;
		if(i == k) {
			System.out.println(a.data);
		}
		return i;
	}

	public static void main(String[] args) {
		Node a = new Node(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		solution1(a,4);
		
		int s =solution2(a,4);
	}

}
