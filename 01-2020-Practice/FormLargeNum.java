/*
 * Question: Largest number formed from an array
 * if array is 3,30,34,9 then it will rearrange the array to 9,34,3,30 because 934330 is the largest number comes out from the array.
 */

class FormLargeNum{

    public static int concatenateInt(int v1, int v2){
        String s1 = Integer.toString(v1);
        String s2 = Integer.toString(v2);

        String s = s1+s2;

        return Integer.parseInt(s);
    }
    public static void swap(int[]a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void FormLargestNumber(int[] a){
        for(int i =0 ; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                int val1 = concatenateInt(a[i],a[j]);
                int val2 = concatenateInt(a[j],a[i]);

                if(val1 < val2){
                    swap(a, i , j);
                }
            }
        }
    }

    public static void main(String args[]) {
        
        int[] a = {3,30,34,9};

        FormLargestNumber(a);
        for(int val : a){
            System.out.print(val);
        }
    }
}