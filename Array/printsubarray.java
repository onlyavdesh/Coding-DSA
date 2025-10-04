import java.util.*;
public class printsubarray {
    public static void subarray(int num[]){
        for (int i = 0 ; i<num.length ; i++){ //start 
            int start = i;
            System.out.println();
            for ( int j = i; j<num.length;j++){// end 
                int end = j ; 
                System.out.println();
                for ( int k = start ; k <= end ; k++){// to print subarray 
                    System.out.print( num[k] + " "  );
                } 
            }  System.out.println ();
        }System.out.println();
    }
    public static void main (String args[]){
        int num[] = {2,3,4,5,6};
        subarray(num);
    }
  
}

