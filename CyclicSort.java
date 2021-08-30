
public class CyclicSort {
	
	private static void cyclicSort(int[] a) {
		int index = 0;
		while(index < a.length) {
			int tempIndex = a[index] - 1;
			if(a[tempIndex] != a[index]) {
				swap(a, index, tempIndex);
			}
			else {
				index++;
			}
		}
	}
	public static void swap(int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};

		cyclicSort(a);
		for(int temp : a)
			System.out.print(temp+ " ");
	}

}
