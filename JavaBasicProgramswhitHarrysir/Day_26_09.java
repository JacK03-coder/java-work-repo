public class Day_26_09 {
    
    public static void main(String[] args) {
        int [] arr ={45,56,94,6,94,64,9,4,65,49,64,49,4,464,9464,9,64,664,6446,46,496};
        int largest = arr[0];

        for(int i = 0 ; i< arr.length ; i++){
            if(largest <arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);

    }
}
   