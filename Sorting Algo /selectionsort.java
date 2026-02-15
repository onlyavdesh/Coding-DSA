import java.util.Arrays;

public class selectionsort {
   
   public static void main(String args[]) {
        int arr[] = {3,56,12,7,-1,8};
        int n = arr.length; 
        for ( int i = 0 ; i<n-1; i++ ){
            int min = Integer.MAX_VALUE;
            int mindex = 0 ; 
            for ( int j = i ; j<n;j++){
                if (arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
               
            } 
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}//
    

