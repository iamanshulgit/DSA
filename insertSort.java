package insertSort;

public class solution {

	public static void main(String agrs[]) {
		int[] a = {6,4,2,5,3,1};

		for(int i = 0 ; i < a.length; i++) {
			int temp = a[i];
			int j = i- 1;
			for(;j>=0 && a[j]> temp; j--) {
				a[j+1] = a[j];
			}
			a[j+1]=temp;
			for(int q : a)
				System.out.print(q + " ");
			System.out.println();
		}
		for(int q : a)
			System.out.print(q + " ");
	}
}

