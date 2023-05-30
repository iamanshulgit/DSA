/*
 * Given array N*N, rotate the image by 90 degree.
 */
public class RotateMatrix {
    private static void rotate(int[][] ar){
    	 
        int l = ar.length;
 
        int[][] a = new int[l][l];
        for(int i = 0; i <  l; i++){
            for(int j = l-1,k=0; j >=0 && k < l ; j--, k++){
                a[i][k] = ar[j][i];
            }
        }
 
        for(int i = 0; i <  l; i++){
            for(int j = 0; j <l ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
 
      int[][] a = {
          {0,1,2,3},
          {4,5,6,7},
          {8,9,10,11},
          {12,13,14,15},
      };
      rotate(a);
    }
}
