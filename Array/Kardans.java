public class Kardans {
    public static void kardan(int arr[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for ( int i = 0; i<arr.length;i++){
            currentsum = Math.max(arr[i],currentsum + arr[i]);
             maxsum = Math.max(maxsum, currentsum) ;
            } System.out.println("Your max sum is "+ maxsum);
          }
    public static void main(String args[]){
        int arr[] = { -2,-3,-4,-6,-9,-5,-20};
        kardan(arr);
    } 
    

}