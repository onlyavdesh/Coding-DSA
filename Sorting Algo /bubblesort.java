import java.util.*;
public class bubblesort {
    public static void main ( String args[]){
        int arr[] = {2,56,778,88,2,5,89};
        int n = arr.length; 
        for (int i = 0 ; i<n-1;i++){
            int swap = 0; 
            for (int j = 0 ; j<n-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
                if (swap == 0 ){
                    break;
                }
            }
        }System.out.println(Arrays.toString(arr));

    }

}//////
///////
