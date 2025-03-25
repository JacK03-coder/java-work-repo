import java.util.Scanner;

public class Day_29_09_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = {5,6,96,8,69,4,59,69,4,4};
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int element: arr){
            System.out.println(element);
        }
    }
}
