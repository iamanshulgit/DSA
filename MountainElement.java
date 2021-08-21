/*
 * Question: Find mountain element in an sorted array?
 */
public class MountainElement {

	private static int mountainElement(int[] a) {
		int first = 0, mid, last = a.length-1;

		while(first < last) {
			mid = (first+last)/2;
			if(a[mid] > a[mid+1]) {
				last = mid;
			}else {
				first = mid+1;
			}
		}
		
		return a[first];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {0,1,2,3,4,5,3,2};
		System.out.println("Mountain Element is " + mountainElement(a));
	}

}
