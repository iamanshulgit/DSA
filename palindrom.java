package palindrome;
import java.util.*;

public class solution {

	public static void main(String[] args) {
		//k = number of char to be used in the palindrome.
		//n = length of the palindrome string
	int k=2, n=7,j=0,i=0;

	Random rand = new Random();

        String s="";
        for(int index = 0; index <k ; index++) {
        	char c = (char)(rand.nextInt(26) + 'a');
        	s+=c;
        }
        String r="";

        for(;i<n/2;i++,j++){
            if(j==k)
                j=0;
            else
                r+=s.charAt(j);
        }

        if(n%2!=0){
            r+=s.charAt(0);
            i++;
            j= i - 2;
        }
        else
            j=i-1;


        for(;j>=0;j--)
            r+=r.charAt(j);

        System.out.print(r);

	}

}

