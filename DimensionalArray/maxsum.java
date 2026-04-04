package DimensionalArray;

public class maxsum {
 public static void main(String[] args) {
     int [][] arr = {{3,45,6,78,889,9},{6,5,434,3,322,67},{1,3,4,567,89,90}};
     int max = Integer.MIN_VALUE;
     int row = 0 ; 
        for (int i = 0 ; i<arr.length;i++){
            int sum = 0 ; 
            for (int j = 0 ; j<arr[0].length;j++){
                sum += arr[i][j];
            } 
            max = Math.max(max,sum);
            row = i ;
         
 }
     System.out.println(max + " "+ row);

 }
}
///////
/// 
/// 
/// 
/// 
/// 
/// 
/// 

