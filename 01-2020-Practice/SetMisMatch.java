
public class SetMisMatch{
	 
    private static void misMatchSet(int[]a){
        int i = 0;
        int[] sol = new int[2];
        while(i < a.length){
            if(a[i]-1 != i){
                sol[0]=a[i];
                sol[1]=i+1;
 
            }
                i++;
 
        }
        print(sol);
 
    }
    public static void solution(){
        int[] a={1,2,3,4,5,5};
 
        misMatchSet(a);
    }
    private static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static void print(int[] a){
        for(int t : a)
            System.out.print(t + " ");
    }
 
     public static void main(String []args){
        solution();
     }
}