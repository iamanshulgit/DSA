/*
Amazon question: send an integer and return the capital letter  in a pattern?
I used recursion.
Example: 1 -A, 26-Z, 51-AY,52-AZ,53-BA,702-ZZ,704-AAB
*/
public class NumberToASCII{
    static String solution="";
    public static String sol(int val){
        String s1= "", s2="";
        if(val<=26){
        	String str = new Character((char) (val+64)).toString();
            return str;
        }
        else{
        	s1 = new Character((char) ((val-1)%26+65)).toString();
        	System.out.print((val-1)%26+65);
        	s2= sol((val-1)/26);
        }
        solution = s2+s1;
        
        
        return solution;
    }
     public static void main(String []args){
	int[]a = {1,26,51,52,53,676,702,704};
	for(int temp : a) {
		solution = "";
		System.out.println(sol(temp));
	}
    }
}
