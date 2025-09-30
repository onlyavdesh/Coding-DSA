public class linearsearch {
    public static int linearsr(int num[] ,  int key){
        for(int i = 0 ; i<num.length;i++){
            if( num[i] ==key){
            
                System.out.println("Your Number is found" + num );
                return i;
                } else {
                    System.out.println("Your number is not in list "+ key );
                }

            }
        return key;
        }




    public static void main(String args[]){
        int num[] = {2,4,5,56,89};
        int key = 90;
       linearsr(num, key);

    }
    
}

