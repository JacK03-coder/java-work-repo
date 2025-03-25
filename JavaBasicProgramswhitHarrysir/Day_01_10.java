
import java.util.Scanner;
class removeDuplicate{
    public int removeDuplicate(int arr[]){
        if(arr.length == 0){
            return 0;
        }

        int uniqueIndex = 0;
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]!= arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex +1;
        
    }

 }
public class Day_01_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        removeDuplicate rd = new removeDuplicate();
        int [] arr = {0,0,1,1,2,2,3,3,4,4,5,5,6,7,8,9,10,11,11,12,21,46,98,106,106,1070}; 
        int k = rd.removeDuplicate(arr);
        System.out.println("gdfuyw:::"+k);
        System.out.println("The element of the array are : ");
        for(int i = 0 ; i<k ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array element's are: ");

        for (int i = 0; i < arr.length; i++){
            System.out.println(" "+arr[i]);
        }
            
        }
}
