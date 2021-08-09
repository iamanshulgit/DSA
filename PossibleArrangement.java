/*
 * 
 */
public class PossibleArrangement {

	public static void swap(int[] a, int i, int index) {
		int temp = a[i];
		a[i] = a[index];
		a[index] = temp;
	}
	public static void printPermutation(int[] a, int index) {
		if(index == a.length-1) {
			for(int i = 0; i < a.length; i++)
				System.out.print(a[i]);
			System.out.println();
		}
		else {
			for(int i = index; i < a.length; i++ ) {
				swap(a,i,index);
				printPermutation(a, index+1);
				swap(a,i,index);
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		printPermutation(a,0);
		
	}

}
