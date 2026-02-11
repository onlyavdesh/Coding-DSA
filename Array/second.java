public class second {
    public static void main (String args[]){
        int arr[] = {1,3,4,5,66};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for ( int i = 0 ;i<n;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        for ( int j = 0 ; j<n; j++){
         if (smax<arr[j] && max!=arr[j]){
            smax = arr[j];
         }
        }
        System.out.println(max );
        System.out.println(smax);


    }
}
