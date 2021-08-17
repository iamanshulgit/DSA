/*
 * If an element in an M*N matrix is 0then set entire row and column to 0.
 */

import java.util.ArrayList;

public class ZeroMatrix {
    public static void zeroMatrix(int[][]a,int m,int n){
        ArrayList<Integer> check = new ArrayList<Integer>();
        for(int i =0; i < m ; i++){
            for(int j =0; j< n; j++){
                if(a[i][j]==0){
                    if(!check.contains(i) && !check.contains(j)){
                        check.add(i);
                        check.add(j);
                        for(int k=0,l=0;k<m || l<n;k++,l++){
                            if(k<m){
                                a[k][j]=0;
                            }
                            if(l<n){
                                a[i][l]=0;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i <  m; i++){
            for(int j = 0; j <m ; j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
 
     public static void main(String []args){
        int[][] a = {
          {4,1,2,3},
          {4,0,6,7},
          {8,9,10,11},
          {12,13,14,15},
      };
        int m = a.length;
        int n = a[0].length;
        zeroMatrix(a,m,n);
     }
}
