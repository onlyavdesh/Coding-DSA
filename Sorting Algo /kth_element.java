public class kth_element {
    
    public int kthSmallest(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {

            int min = Integer.MAX_VALUE;
            int minIndex = i;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1];
    }
    // Code 

    public static void main(String args[]) {
        int arr[] = {3, 5, 2, 5, 7, 7, 78};
        int k = 5;

        kth_element obj = new kth_element();   // create object
        int result = obj.kthSmallest(arr, k);  // call method

        System.out.println("Kth smallest element: " + result);
    }
}