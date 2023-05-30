/*
 * Question: Print number is prime or not?
 */
public class primeNumber {
	
	public static void prime(int a) {
		for(int i = a/2; i > 1; i--) {	
			if(a%i==0) {
				System.out.println(a + " is not Prime.");
				return;
			}
		}
		System.out.println(a + " is Prime.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,5,9,23,57,87,99,101};
		for(int i = 0; i < a.length; i++)
			prime(a[i]);
	}

}
