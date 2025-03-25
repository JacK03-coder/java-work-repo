/*
 * PreFix Array Sum Method:: it is a method to print the sum of the subArray from an Array Basically if we do it by nested loop we can do it but in that case the time complexity is 
 * very high i guess O(n^3) , but by this it is O(n^2)....So to solve this problem we use the concept or we can say Prefix Method to solve the problem we simply crate an new Array name Prefix,
 *  the Element of the prefix array are sum of main array Element like in first index is sum of first index from main array means same as main array , but the value of second index of the prefix array 
 * is sum of first and second index sum of main array , same in third  index of prefix array is the sum of first , second and thired index of main array and so on but for that we use an 
 * formula ::: prefix[i] = prefix[i-1] + arr[i] :::  cause we already know few sum of main array element so we just add the element with prefix array element and get the next sum....so easy and simple
 * after creating the prefix Array we create loops and find the maximum subArray sum for that we create nested loop and find the value of end and start point which point helps as to track
 * on the element we have to add to print the sum of sub array because the prefix Method provide  an formula to print the sum of Sub array which is ::
 * :::::::currentSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1]::::::::
 * if you are not getting the formula it's not my problem  , after this we are simply compare the value of cuurent sum with maximum sum and update the value of maximum sum.......
 * So simple you can do it just try....  
 * 
 * Kadane's Algorithm:: this is an another way to solve the problem in this we initilize two value's cuurent sum and maximum sum  the current sum is 0 and maximum sum is mins infinity
 * then we add the value of current sum with the element of the array if the value is positive we update the value and if the value is nagative we write the value 0 ....
 * and parallelly we update the value of maximum sum , the maximum sum is update when the value of current sum is grater then the maximum value ... 
 * We do that process till the last element of the array and after  we done the process menas till loop is over we get the maximum sum of the Subarray available in the Array....... 
 */
public class Day_17_10_MaxSumOfSubArrayByPrefixM {

    public static void MaxSumOfSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];


        prefix[0] = arr[0];
        for(int i =1 ; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i =0 ; i<arr.length ; i++){
             int start = i;

             for(int j= i ; j<arr.length ; j++){
                int end = j;

                currSum = start==0 ? prefix[end] : prefix[end]- prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
             }

        }
        System.out.println("The maximum sub array Sum from the array is : "+maxSum);
    }   

    // Maximum Sub Array by kandan's Algorithm..... 

    public static void kadaneAlgo(int arr[]){

        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length ; i++){
             currsum = arr[i] +currsum;
             if(currsum<0){
                currsum = 0;
             }
             maxSum = Math.max(currsum, maxSum);
        }
        System.out.println("Our Maximum subArray Sum Is: "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxSumOfSubArray(arr);
        kadaneAlgo(arr);
        
    }
}
