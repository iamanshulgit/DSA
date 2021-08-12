/*
 * Question: to print all the subset of an array.
 */
import java.util.*;

public class SubSet {

	static List<List<Integer>> res = new ArrayList<List<Integer>>();		//result List of List
	public static void subSet(int start,List<Integer> cur,int[] nums) {
		res.add(new ArrayList<Integer>(cur));								//copying the current value of List by making a new object

		/*
		 * Moving forward in the array, 
		 * while adding each element to cur(current) list and 
		 * backtracking 
		 * and then removing the last added element in the list.
		 */
		for(int i = start; i <nums.length; i++){
			cur.add(nums[i]);
			subSet(i+1,cur,nums);
			cur.remove(cur.size()-1);		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3};
		subSet(0,new ArrayList<Integer>(),ar);
		for(List<Integer> val1 : res) {
			System.out.println(val1);
		}
	}

}
