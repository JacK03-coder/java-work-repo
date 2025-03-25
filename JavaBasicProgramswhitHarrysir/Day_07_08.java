
import java.util.Arrays;
public class Day_07_08 {
    public class SubarraySum{
        public static int [] findSubarray(int[] arr , int n , int s){
            int start = 0;
            int current_sum = 0;
            for(int i =0 ; i<n ; i++){
                current_sum +=arr[i];

                while(current_sum>s && start <=i){
                    current_sum -= arr[start];
                    start++;
                }
                if(current_sum ==s){
                    return new int[]{start+1 ,i+1};
                } 
            }
            return new int[]{-1 ,-1};
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,8,3,1,7,5};
        int s = 12;
        int n = arr.length;
        int [] result = SubarraySum.findSubarray(arr,n ,s);
        System.out.println(Arrays.toString(result));
    } 
}