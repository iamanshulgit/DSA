

public class AllDuplicatesInAnArray{
	 
    public static void solution(){
        int[] a={5,4,3,2,3,1,5,0};
 
        allDuplicatesInAnArray(a);
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
    private static void allDuplicatesInAnArray(int[]a){
        int i = 0;
        while(i < a.length){
            int b = a[i];
 
            if(a[i] != a[b]){
                swap(a,i,b);
            }
 
            else
                i++;
 
        }
        i=0;
        while(i<a.length){
                        if(a[i]!=i){
                System.out.println("Duplicate number found: " + a[i]);
            }
            i++;
        }
 
 
    }
 
     public static void main(String []args){
        solution();
     }
}