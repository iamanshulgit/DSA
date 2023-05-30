

import java.util.*;
public class RockPaperScissor{
 
    private static boolean startGame(){
        boolean flag = false;
        String random = "";
        int chance = 5;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        while(chance > 0){
 
            int ch = (int)(Math.random()*2);
            //System.out.println(ch);
 
            switch(ch){
            case 0:
                random = "Rock";
                break;
            case 1:
                random = "Paper";
                break;
            case 2:
                random = "Scissor";
                break;
            }
            //System.out.println(random);
 
            //int val = (int)(Math.random()*3);
            System.out.println("\nEnter Your Option: \nRock: 1\nPaper: 2\nScissor: 3\n");
            int val = sc.nextInt();
            if(val == 1){
                if(ch == 0 || ch == 2){
                    System.out.println("Let's Break it. I got "+ random);
                }
                else{
                    System.out.println("Your Paper wrapped the Rock. I lost.");
                    score++;
                }
            }
            else if(val ==2){
                if(ch == 0 || ch == 1){
                    System.out.println("Let's Wrap it. I got "+ random);
                }
                else{
                    System.out.println("Your Scissor cut my Paper. I lost.");
                    score++;
                }
            }
            else if(val ==3){
                if(ch == 1 || ch == 2){
                    System.out.println("Let's cut it. I got "+ random);
                }
                else{
                    System.out.println("Your Rock broke the Scissor. I lost.");
                    score++;
                }
            }
            else{
                System.out.println("Worng Input! Cheater.");
            }
 
            chance--;
        }
        if(score < 2)
            flag = false;
        else
            flag = true;
        return flag;
    }
 
 
     public static void main(String []args){
 
        if(startGame()){
            System.out.println("You won!!!");
        }
        else{
            System.out.println("          ..");
            System.out.println("You Lose (:P)");
            System.out.println("          **");
        }
     }
}