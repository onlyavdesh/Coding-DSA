package DimensionalArray;
public class max_of_min {
     public static void main(String[] args) {
     int [][] arr = {{3,45,6,78,889,9},{6,5,434,3,322,67},{1,3,4,567,89,90}};
     int max = Integer.MIN_VALUE;

        for (int i = 0 ; i<arr.length;i++){ 
                 int min = Integer.MAX_VALUE;
            for (int j = 0 ; j<arr[0].length;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];}
                } 
                if (min>max){
                    min = max;
                } 
             } System.out.print(max);
 } 
    
}




