import java.util.*;
public class basicque {
    // Integer.MIN_VALUE for -infinity
    // Integer.MAX_VALUE for +infinity

    // largest number 
    public static int largestnum(int nums[]){
        int largeval = Integer.MIN_VALUE;
          for (int i=0; i<nums.length ; i++){
             if (largeval<nums[i]){
                largeval = nums[i];
             } 
          } return largeval;
    } 
    public static void main ( String args[]){
        int nums[] = { 34,56,7,8,9,90,78};
        System.out.println(largestnum(nums));
    }
}
