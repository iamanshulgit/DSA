/*
 * Question: This problem was recently asked by Microsoft:
 *Given a list of numbers of size n, where n is greater than 3, find the maximum and minimum of the list using less than 2 * (n - 1) comparisons.
 */
import java.util.*;
public class MicrosoftMinMax {

	
	static int count = 1;
	    private static void findMinMax(ArrayList<Integer> cur){
	        int tempB = cur.get(0);;
	        int tempS = cur.get(0);;
	        
	        for(int i =1; i<cur.size()-1;i++) {
	        		count++;
	        		if(tempB<cur.get(i+1)) {
	        			tempB=cur.get(i+1);
	        		}
	        		count++;
	        		if(tempS>cur.get(i+1)) {
	        			tempS=cur.get(i+1);
	        		}
	        	
	        }
	        System.out.println("Max Value = "+tempB + ", Min Value = " + tempS);
	    }

	     public static void main(String []args){
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(4);
	        list.add(3);
	        list.add(2);
	        list.add(1);
	        list.add(0);
	        findMinMax(list);
	        if(count < 2*(list.size()-1) )				//checking the condition of number of compare
	        	System.out.println("Accepted");
	        else
	        	System.out.println("Not Accepted");
	     }
	

}
