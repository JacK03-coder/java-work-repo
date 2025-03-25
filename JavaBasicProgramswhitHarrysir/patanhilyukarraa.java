
import java.lang.reflect.Array;
import java.util.Arrays;

 class PrintSum{
    public int[] Sum(int[] arr , int target){

        for(int i =0 ; i<arr.length ;i++){
            for(int j= 0;  j < arr.length; j++){
                if(arr[i]+ arr[j] == target){
                    if(i==j){
                        continue;
                    } 
                    return new int[] {i,j};
                }
            }
        }return new int[] {-1 , -1};
    } 
 }

public class patanhilyukarraa {
    public static void main(String[] args) {
        int [] arr = {2,11,15,7,5,6,4,2,6};
        int target = 11;
        PrintSum result = new PrintSum(); 
        System.out.println(Arrays.toString(result.Sum(arr, target)));
        
    }
}
 