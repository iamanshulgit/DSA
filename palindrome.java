import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		//k = number of char to be used in the palindrome.
		//n = length of the palindrome string
	int k=3, n=5,j=0,i=0;

	Random rand = new Random();

        String s="";
        String r="";
        for(int index = 0; index <k ; index++) {
        	char c = (char)(rand.nextInt(26) + 'a');
        	s+=c;
        }
        
        for(;i<n/2;i++,j++){
            if(j==k)
                j=0;
            
            //int temp = rand.nextInt(k);
            r+=s.charAt(j);
        }

        if(n%2!=0){
            int temp = rand.nextInt(k);
            r+=s.charAt(temp);
        }

        for(j=i-1;j>=0 && i <n ;j--)
            r+=r.charAt(j);

        System.out.print(r);

	}

}
