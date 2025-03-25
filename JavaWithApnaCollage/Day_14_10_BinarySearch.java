
import java.util.Arrays;

public class Day_14_10_BinarySearch {

    //Binary search.....
    public static int binarySearch(int numbers[] , int key){
        int start = 0 , end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(mid==key){
                return key;
            }
            if(mid<key){
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        // Shorting an Array using for loop

        int arr[] = {5,4,69,89,7,497,74,964,97,896,5979,7,949,79,79,479,7979,9,797};
        for(int Element: arr){
            System.out.print(Element+" ");
        }
        for(int i =0 ; i<arr.length; i++){
            for(int j=0;j<i ; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]   = arr[j];
                    arr[j]   = temp;   
                }
            }
        }
        for(int Element : arr){
            System.out.println(Element);
        }
        System.out.println();

        //Shorting an Array Using sort()  Method...
        Arrays.sort(arr);
        for(int Element: arr){
            System.out.print(Element+" ");
        }


        //Binary Search.........
        System.out.println();
        System.out.println();
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,859,897};
        int key = 155;
        System.out.println(binarySearch(numbers, key));

    }
}
