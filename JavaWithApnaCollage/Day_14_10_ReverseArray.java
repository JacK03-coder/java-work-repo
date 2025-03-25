public class Day_14_10_ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int start = 0  , end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]   = arr[end];

            start++;
            end--;
        }

        for(int Element: arr){
            System.out.print(Element+" ");
        }
    }
}
