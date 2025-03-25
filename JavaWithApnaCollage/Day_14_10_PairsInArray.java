// Code to print Pairs of number in an Given Array ..........
public class Day_14_10_PairsInArray {
    public static void printPairs(int arr[]){
        int totPairs = 0;
        for(int i = 0; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
            totPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are : "+totPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr);
    }
}
  