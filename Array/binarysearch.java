public class binarysearch {

    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // prevent overflow

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid; // found, return index
            }
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // If element not found
        return -1;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14}; // must be sorted
        int target = 10;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array");
        }
    }
}