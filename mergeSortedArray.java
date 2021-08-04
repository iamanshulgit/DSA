//Question: Merge 2 sorted array and sort the final solution?

//Solution:
public class mergeSortedArray{
	public static void main(String args[]) {
        int[] a= new int[]{1,3,5};
        int[] b= new int[]{2,4,6};
        
        int[] r = new int[a.length+b.length];
        
        int j=0,k=0;
        
        for(int i=0;i<r.length; i++){
            for(;j<a.length || k<b.length;){
                
                if(j==a.length){    //copy from b array to r array if a array is completed.
                    r[i]=b[k];
                    k++;
                    break;
                }
                if(k==b.length){    //copy from a array to r array if b array is completed.
                    r[i]=a[j];
                    j++;
                    break;
                }
                
                if(a[j]<b[k])     //sort by comparing elements from both array
                {
                    r[i]=a[j];
                    j++;
                    break;
                }
                else{
                    r[i]=b[k];
                    k++;
                    break;
                }
                
            }
            
            
        }
        for(int i=0;i<r.length; i++)
            System.out.print(r[i]+" ");
        
}
}