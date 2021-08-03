Question: Write a question where you have to form diamond like structure from the playing cards in following pattern:
   1
  222
 33333
  222
   1
   
   
Solution:
        int count = 1;    //to print the number in the diamond
        int n = 3;        //size or heigth
        int i;
        for(i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){             //for the space 
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++ ){          //for printing number
                System.out.print(count);
            }
            count++;
            System.out.println();                     //after each for loop go to next line
        }
        count -=2;
        i-=2;
        for(; i >=0  ;i--){
            for(int j = 0 ; j < n-i; j++){             //for the space 
                System.out.print(" ");
                
            }
            for(int k =0; k < 2*i+1; k++){          //for printing number
                System.out.print(count);
            }
            count--;
            System.out.println();                     //after each for loop go to next line   
        }
