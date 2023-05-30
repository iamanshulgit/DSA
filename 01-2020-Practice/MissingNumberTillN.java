
public class MissingNumberTillN {
	public static void solution(int[] a) {
		int i = 0;
		while(i < a.length) {
			int temp = a[i];
			if(a[i]<a.length && a[temp] != a[i] ) {
				swap(a,i,temp);
			}
			else
				i++;
		}
		i=0;

		while(i < a.length) {
			if(a[i] != i) {
				System.out.println("Number missing is: "+i);
			}
			i++;
		}
	}
	static void swap(int[]a ,int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,3,2,1,0};
		int[] b= {4,3,2,7,8,2,3,1,1};
		solution(b);
	}

}
