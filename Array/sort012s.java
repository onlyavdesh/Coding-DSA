public class sort012s {
    
    public void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        int n = arr.length;

        // Count 0s, 1s and 2s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        int index = 0;

        // Fill 0s
        for (int i = 0; i < c0; i++) {
            arr[index++] = 0;
        }

        // Fill 1s
        for (int i = 0; i < c1; i++) {
            arr[index++] = 1;
        }

        // Fill 2s
        for (int i = 0; i < c2; i++) {
            arr[index++] = 2;
        }
    }
}
    