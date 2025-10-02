import java.util.*;
public class reverseofarray {
   // Method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
