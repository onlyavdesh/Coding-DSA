import java.util.Arrays;
public class mergetwosort {
    public static void main (String args[]){
        int a[] = { 1,2,3,5,6};
        int b[] = { 7,8,9,90};
        int n = a.length; 
        int m = b.length; 
        
        int[] c = new int[n+m];
        int i=0 , j=0,k=0;
        while (i<n && j<m){
        if (a[i]<b[j]){
            c[k] = a[i];
            k++;
            i++;

        } else {
            c[k] = b[j];

        }

        
    while(i<n){
        c[k++] = a[i++];
    }
    while(j<m){
        c[k++] = b[j++];
    }
     System.out.println(Arrays.toString(c));
} 
    }
}
    
