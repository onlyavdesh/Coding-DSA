public class Array {
    public static void update(int marks[]){
        
        for(int i =0 ; i<marks.length; i++){
            marks[i]=marks[i]+1;
          
        } System.out.println(marks);
    }
public static void main(String args[]){
    int marks[] = {78,90,89,90};
    
    update(marks);
}
    //     int numbers[] = {3,4,5};
    //     System.out.println(numbers);
    // 
}