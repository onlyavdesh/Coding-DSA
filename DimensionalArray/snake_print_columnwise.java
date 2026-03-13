package DimensionalArray;

public class snake_print_columnwise {
 public static void main(String[] args) {
    int [][] arr = {{3,45,6,78,889,9},{6,5,434,3,322,67},{1,3,4,567,89,90}};
    for (int j = 0 ; j<arr[0].length;j++){
        if (j%2==0){
            for (int i = 0; i<arr.length;i++){
                System.out.print(arr[i][j] + " ");
            }
        } 
        else {
            for (int i = arr.length - 1 ; i>=0;i--){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
 }
}
