package String;
public class reverseofstring {
    public static String reverseString(String s) {
       int n = s.length();
       if (n == 1){
           return s;}
       char[] arr = s.toCharArray();
       int i = 0 ; 
       int j = n-1;
       while (i<=j){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
       String X = new String(arr);
        
        return X ;
        
    }

    public static void main(String args[]){
        String S = "fghjDFGHJK";
        System.out.println(reverseString(S));
    }
}
 

