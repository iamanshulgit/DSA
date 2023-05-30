/*
 * Question: String=> aabccccaa  Solution=> a2b1c4a2
 */
public class StringCompression {
	 
    private static String Compression(String ori){
 
        String comp = ""+ori.charAt(0);
        int count = 1;
        for(int i = 1; i < ori.length(); i++){
            if(ori.charAt(i)!=ori.charAt(i-1)){
            	comp += count;
                comp += ori.charAt(i);
                count = 1;           
            }
            else
                count++;
        }
        comp = comp+count;
 
        if(comp.length() == (ori.length()*2))
            return ori;
        else
            return comp;
    }
    public static void main(String args[]) {
 
      String original = "aabcccccaaa";
      System.out.println(Compression(original));
 
    }

}

