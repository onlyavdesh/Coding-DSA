package DimensionalArray;

import java.util.ArrayList;

public class spiralmatrix {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int m = arr.length, n = arr[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        
        while (top <= bottom && left <= right) {
            
            // top row
            for (int j = left; j <= right; j++)
                ans.add(arr[top][j]);
            top++;
            
            // right column
            for (int i = top; i <= bottom; i++)
                ans.add(arr[i][right]);
            right--;
            
            // bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    ans.add(arr[bottom][j]);
                bottom--;
            }
            
            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(arr[i][left]);
                left++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        

    
    }
    
}
//////////////