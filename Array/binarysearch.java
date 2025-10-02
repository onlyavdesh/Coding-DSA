public class binarysearch{
    public static int binarys(int num[] , int key){
        int start = 0;
        int end = num.length-1;
       
        while(start<=end){

            int mid = (start+end)/2;

            if ( num[mid]==key){
                return mid;
            }

            if ( num[mid]<key){
                start = mid +1;
            } 
            if ( num[mid]>key){
                end = mid -1;
            }
        } return -1;


    }

    public static void main(String args[]){
        int num[] = { 1,3,5,6,7,8,9};
        int key = 6;
        int result = binarys(num, key);
     System.out.println(result);
    
}
}