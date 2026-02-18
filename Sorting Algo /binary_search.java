public class binary_search {
    public static void main ( String argsStrings[]){
        int arr[] = { 2,3,5,6,9,11}; 
        int n = arr.length;
        int start = 0 ;
        int end = n-1;
        int target = 11;
        
        while (start <= end ){
            int mid = (start + end )/2;
            if (arr[mid]== target ){
                System.out.print(mid);
                break ;
            } else if ( arr[mid] < target){
                start = mid +1 ;

            } else {
               end = mid - 1;
            }
        }
    } 

    
}
