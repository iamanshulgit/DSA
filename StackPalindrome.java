import java.util.*;

class StackPalindrome{
	//Creating the solution method which accepts 'a' stack object, 
	//it pushes half into another stack and pops from each at same time and 
	//compare each until both stack gets empty
	private static boolean stackPalindrome(Stack a) {
		
        Stack temp = new Stack();
        int len = s.size()/2;
        //System.out.println(s.pop());
        
        //Pop one stack into other until half.
        while(len > 0){
            temp.push(s.pop());
            len--;
        }
        
        //if stack has odd number then pop out middle item
        if(s.size()%2!=0){
            s.pop();
        }
        
        //pop out element from each stack and compare one by one.
        while(s.size() > 0){
            if(temp.peek()!=s.peek())
                return false;		//return false if any element did not match
            temp.pop();
            s.pop();
        }
        return true;
    }
 
     public static void main(String []args){
        System.out.println("Hello World");
        Stack a = new Stack() ;
        a.push("n");
        a.push("i");
        a.push("t");
        a.push("i");
        a.push("n");
 
        System.out.println(stackPalin(a));
     }
}