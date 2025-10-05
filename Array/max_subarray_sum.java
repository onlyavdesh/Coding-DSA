public class max_subarray_sum {
    public static void maxsubarrsum(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            int start = i;
            for (int j = i ; j<arr.length ;j++){
                int end = j ; 
                for (int k = start ; k<=end ; k++){
                   currsum = currsum + arr[k];
                   System.out.println(k+" ");

                }
                System.out.println(currsum);
                if ( maxsum<currsum){
                    maxsum = currsum;
                }
            }
        } System.out.println("This is your maxsum"+maxsum);
    }
    public static void main (String args[]){
        int arr[] = {3,5,6,6,-9};
        maxsubarrsum(arr);
    }
    
}
