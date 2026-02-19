public class peakelement_mountain {
  
    // Made static so we can call inside main
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length; 
        int start = 1, end = n - 2;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If mid is peak
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // If we are on increasing side
            else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // If we are on decreasing side
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2,3,4,6,7,8,9,6,5};

        int result = peakIndexInMountainArray(arr);

        System.out.println("Peak index is: " + result);
        System.out.println("Peak element is: " + arr[result]);
    }
}///////////////