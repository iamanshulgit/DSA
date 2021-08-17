/*
 * Question: Given 2 strings, write a fn to check if they are one edit (or zero edit) away?
 */
import java.util.*;
public class NotMoreThanOneChange {
 
    private static void oneChange(String f, String s){
        if(Math.abs(f.length()-s.length())>1){
          System.out.println("False");
          return;
      }
      else{
          boolean flag = false;
          if(s.length()<f.length()){
              String temp = s;
              s = f;
              f = temp;
          }
          int i=0,j=0;
          while( i < f.length() && j <s.length()){
              if(s.charAt(i)!=f.charAt(j)){
                  if(flag){
                      System.out.println("False");
                      return;
                  }
                  flag = true;
                  if(s.length()==f.length()){
                    i++;
                    j++;
                  }
                  else{
                    i++;
                  }
              }
              else{
                  i++;
                  j++;
              }
 
          }
      }
      System.out.println("True");
    }
    public static void main(String args[]) {
 
      ArrayList<String> f = new ArrayList<String>();
      f.add("pale");
      f.add("pales");
      f.add("pale");
      f.add("pale");
      f.add("pale");
 
      ArrayList<String> s = new ArrayList<String>();
      s.add("ple");
      s.add("pale");
      s.add("bale");
      s.add("bal");
      s.add("bales");
 
      for(int i = 0 ; i < f.size(); i++)
        oneChange(f.get(i),s.get(i));
 
    }
}
