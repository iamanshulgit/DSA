package LinkedListExample;
import java.util.*;

public class Palindrome {
	//making one stack so we can go backwards in a dataset and
	//compare with the Node data; To do that we first moved the 
	//fast mode at double the pace and slow node at regular pace
	//so by the end of fast pace we are in the middle of the Node
	//pointed by slow.
	private static boolean checkPalindrome(Node a) {
		Node slow = a;
		Node fast = a;
		
		//Made Stack as Integer so we can compare Node data that is INT
		//comparable to Stack Object; Otherwise it will throw error.
		Stack<Integer> stack = new Stack<Integer>();
		while(fast!=null && fast.next!=null) {
			stack.push(slow.data);		//pushing the data of slow node into stack so we can go backward
			slow=slow.next;
			fast=fast.next.next;
		}
		
		//checking if the Node has odd number of elements or not
		//if fast node is null then it means we are having even elements in the Node
		//and if not move the slow to next node which is middle node(UNCOMMON ELEMENT).
		if(fast!=null) {
			slow = slow.next;
		}
		
		//Now going to end of the slow Node and popping out the stack
		//and moving slow Node to next element
		//comparing each element and if not same then return false.
		while(slow!=null) {
			if(stack.peek()==slow.data) {
				stack.pop();
				slow = slow.next;
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		Node a = new Node(0);
		a.add(1);
		a.add(2);
		a.add(1);
		a.add(1);
		
		
		if(checkPalindrome(a))  
			System.out.println("Its Palindrome");
		else 
			System.out.println("Its not Palidrome");

	}

}
