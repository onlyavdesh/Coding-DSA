public class pairs_in_array {
    public static void pair(int arr[]){
        int total_pair = 0;
        for (int i = 0; i<arr.length;i++){
            int current = arr[i];
            for ( int j = i+1; j<arr.length ; j++){
                System.out.print("("+ current + "," + j + ")");
                total_pair++;
            } System.out.println();
        }System.out.println(total_pair);
    }
    public static void main(String args[]){
        int arr[] = {23,4,5,56,67,77,7};
        pair(arr);

    }
  
    
}

    

