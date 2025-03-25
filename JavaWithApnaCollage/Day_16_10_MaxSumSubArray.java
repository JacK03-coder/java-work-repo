
import java.util.Scanner;

public class Day_16_10_MaxSumSubArray {

    public static void maxSumSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0 ; i<arr.length ; i++){
            int start = i;

            for(int j =i  ; j<arr.length ; j++){
                int end = j;

                currSum =0;
                for(int k = start ; k<=end ; k++){
                    currSum  += arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum of Sub Array's is : "+ maxSum);
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int arr[] = {2,4,8,6,10};
        maxSumSubArray(arr);

    }
}
