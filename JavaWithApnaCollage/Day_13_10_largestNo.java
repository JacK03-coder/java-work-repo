public class Day_13_10_largestNo {
    public static void main(String[] args) {
        int arr[] = {23,56,59,89,89,89,89,568,9,56489848,46,89,56,658,9898,9889,695,98,98,9,8};
        int max = arr[0];
        int smallest = arr[0];

        for(int i = 0 ; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("The max Element is:: "+ max);
        System.out.println("Smallest Element is:: "+smallest);
    }
}
