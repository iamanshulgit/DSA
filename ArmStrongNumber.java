/*
 * Question: Print which number is Armstrong number?
 * 153 = cubeOF(1)+cubeOF(5)+cubeOF(3) = 153 then is Armstrong number
 * 8 = Math.pow(8,1) = 8 then is Armstrong number
 */
import java.util.*;
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {153,399,246,8,1634};
		for(int val : a)
			checkArmstrng(val);
	}

	private static void checkArmstrng(int a) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		int count = 0, result = 0, val = a;
		while(val>0) {
			nums.add(val%10);
			val/=10;
			count++;
		}
		for(int i = 0; i < nums.size(); i++) {
			
			result+=Math.pow(nums.get(i), count);
		}
		if(result == a)
			System.out.println(a + " is Armstrong.");
		else
			System.out.println(a + " is not Armstrong");
	}

}
