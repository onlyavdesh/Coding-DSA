public class Kardans {
    public static void kardan(int arr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for ( int i = 0; i<arr.length;i++){
            currentsum = currentsum +arr[i];
            if ( currentsum < 0){
                currentsum = 0;
            } 
            if ( maxsum < currentsum ){
              maxsum = currentsum;
            }

        }System.out.println("Your max subarray sum is "+maxsum);
    }
    public static void main(String args[]){
        int arr[] = { 2,3,4,-6,-9,5,-20};
        kardan(arr);
    } 
    
}
