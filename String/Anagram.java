package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean Ana(String S , String O){
        if (S.length()!= O.length()){
            return false;
        }
        char[] arr1 = S.toCharArray();
        char[] arr2 = O.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         for (int i = 0 ; i<S.length() ; i++){
            if (arr1[i]!=arr2[i]){
                return false ;
            }
         }

       return true; 
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Give First String ");
      String R = sc.nextLine();
      System.out.println("Give Second String ");
      String W = sc.nextLine();
      System.out.print(Ana(R,W));

    }
    
}
////////