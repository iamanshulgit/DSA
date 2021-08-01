Question: Print the number from an array which is second largest element?

Solution:

        int[] a= new int[]{2,9,3,9,1,8,4,7,1,-1}; 
        int f =a[0];
        int s = a[1];
        
        for(int i = 2; i < a.length; i++){
            if(f < a[i]){
                s=f;
                f=a[i];
            }
            else if(s<a[i]){
                s=a[i];
            }
        }
         
         
        System.out.println(f);    //print largest number
        System.out.println(s);    //print second largest number
