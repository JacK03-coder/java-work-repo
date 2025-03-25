
// Check Array contain Duplicate Element or not..............
public class Day_19_10_CheckDuplicate {

    public static boolean checkDuplicate(int arr[]){

        for(int i = 0; i<arr.length ; i++){
            for(int j = i+1 ; j <arr.length ; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5,96,9,55,95,45};
        System.out.println(checkDuplicate(arr));
    }
}
