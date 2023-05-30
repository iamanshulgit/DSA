/*
 * Question: Move the knight to every square of the chess board without repeating the same square.
 */
		
public class KnightTour{
	//counting the number of moves that should be maximum 8*8=64
    private static int count = 1;
    //these are the possible pair of move a knight can move.
    private static int[] xpos={2,-2,2,-2,1,1,-1,-1};
    private static int[] ypos={1,1,-1,-1,2,-2,2,-2};
    
    //checking the valid position by putting condition that knight is not going out of bound and not visited the same spot.
    public static boolean isValid(int[][]a,int x, int y){
        if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]==0 ){
            return true;
        }
        return false;
    }
    //Backtracking the next position and numbering the moves on the board.
    public static void nextPos(int a[][], int xp, int yp){
        int x,y;
        if(count<=64)
            for(int cur=0;cur<8;cur++){
                x=xpos[cur]+xp;
                y=ypos[cur]+yp;
                if(isValid(a,x,y)){
                    a[x][y]=count++;
                    nextPos(a,x,y);
                }
            }

    }
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0;j <a[i].length; j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }

     public static void main(String []args){
         
         int[][] a={
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
             {0,0,0,0,0,0,0,0},
         };
         nextPos(a,0,0);		//assigning the initial value of Knight
         
         if(count == 65){
             printArray(a);
         }
         else{
             System.out.println("Failed");
         }
        
     }
}