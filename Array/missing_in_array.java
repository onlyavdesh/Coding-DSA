public class missing_in_array {
    int missingNum(int arr[]) {
        long n = arr.length + 1; 
        
        long actual_sum = n * (n + 1) / 2;
        long sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        long missing_num = actual_sum - sum;
        
        return (int) missing_num;   // explicit cast
    }
}

