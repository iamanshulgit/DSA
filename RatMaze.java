/*
 * Question: using Backtracking method, Using 2D arrays move rat to destination(value of 2) by following the path which has value of 1.
 */
public class RatMaze {
	//to check that rat reached destination or not.
	static boolean flag = false;
	
	//to check the condition that next move is valid or not
	private static boolean isValid(int[][]a,int x, int y) {
		if(x>=0 && y>=0 && x<a.length && y<a[0].length && a[x][y]==1) {
			return true;
		}
		return false;
	}
	
	/*To print the array
	 * private static void printArray(int[][]a) {
		for(int[] b : a) {
			for(int c : b)
				System.out.print(c + " ");
			System.out.println();
		}
		
	}
	*/
	
	private static boolean movPos(int[][]a, int xpos, int ypos) {
		if(xpos>=0 && ypos>=0 && xpos<a.length && ypos<a[0].length) {		//make sure the x and y position in under the range
		if(a[xpos][ypos]==2) {												// to check if rat reached Destination
			flag = true;
			return true;
		}
		if(isValid(a, xpos, ypos)) {										//to check the next move and validate it
						a[xpos][ypos] = 3;
			if(movPos(a,xpos+1,ypos)) {
				//System.out.println("Moved Down   " + xpos + " " + ypos);
				return true;
			}
			if(movPos(a,xpos-1,ypos)) {
				//System.out.println("Moved Top    " + xpos + " " + ypos);
				return true;
				
			}
			if(movPos(a,xpos,ypos+1)) {
				//System.out.println("Moved Right   " + xpos + " " + ypos);
				return true;
				
			}
			if(movPos(a,xpos,ypos-1)) {
				//System.out.println("Moved Left    " + xpos + " " + ypos);
				return true;
				
			}			
		}
			a[xpos][ypos] = 3;													//if next move is not valid then change the value so it avoid back and forth movement
			return false;

		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] puzzle = {
				{1,1,0,0,0,0},
				{0,1,0,1,0,1},
				{0,1,0,1,1,1},
				{0,1,1,1,0,1},
				{0,1,0,0,0,1},
				{0,1,0,0,0,1},
				{1,1,0,0,0,2}
		};
		int xPos = 0, yPos=0;
		movPos(puzzle, xPos, yPos);
		if(!flag)
			System.out.println("Rat stuck!!!-> No solution.");
		else
			System.out.println("Rat Won!!!");
	}

}
