package DimensionalArray;

public class rotateby90 {
    public static void rotate( int[][] arr){
        //transpose 
        for (int i = 1;i<arr.length;i++){
            for ( int j =i+1 ; j<arr.length;j++){
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp; 
            }
        }
       // reverse 
        for ( int i = 0 ; i<arr.length;i++){
           int s = 0 ; 
           int e = arr[0].length;
           while (s<e){
            int temp = arr[i][s];
            arr[i][s] = arr[i][e];
            arr[i][e] = temp ; 
            s++;
            e--;
           }
        }
      
    }

    public static void main(String args[]){
        int [][] arr = {{3,45,6,78,889,9},{6,5,434,3,322,67},{1,3,4,567,89,90}};
        rotate(arr);
    }
    
}
/////////////
