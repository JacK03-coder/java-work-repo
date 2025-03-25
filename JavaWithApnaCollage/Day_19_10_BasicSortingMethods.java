
import java.util.Arrays;
 
/*                     :::::::::::::::::::::::::::::::::::::::::::::BASIC SHORTING METHOD:::::::::::::::::::::::::::::::::::::::::::::
 *1.Bubble Sort :: This is a Sorting technique. Basically in this we push the largest element at the last.... and compare every Element with next element from it and place 
 *                 the element at the right place where the elemet should have...........
 * 
 * 2.Selection Short ::In this sorting method we select the sortest element from the array and place it in the front of the array , and start doing the same proccess for the remainnig 
 *                     elment and once we place the element in the front we concider it as sorted .. Basically this code we swap only the index in which we are with the smallest element 
 *                     from the array and place the smallest element in the index and so on and we already know we start index from 0 which is first index ...now i guess you get it...
 * 
 * 3.Insertion Sort:: In this sorting method we basically choose an element and put it in it's right position and do this with every element......
 * 
 * 4. Counting Sot:: This is a sorting technique in which we count the frequency of element's and store them into a new array the new Array length is largest Element from the array +1
 *                    becasue the array index start from 0 so we add +1 element with the count array , so after this we created an count array and we already have the main array which we 
 *                    are going to sort so we initilize an int which help us to put element in the index which is basically the index number start from 0 , we run a for loop over the 
 *                    count array and inside it run a while loop which is simply decrease the frequency and place the element of array in sotrted order .. you want more clearity on it
 *                    just simply dry run the code in notebook with any array rhe concept will clear i am damm sure about it...
 */

 import java.util.Arrays;
public class Day_19_10_BasicSortingMethods {
    //1. BUBBLE SORT........
    public static void bubbleSort(int arr[]){
        int swap =0;
        for(int i = 0 ;i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length-i; j++){
            if(arr[i]>arr[j]){
                 int temp = arr[i];
                arr[i]   = arr[j];
                arr[j]   = temp;
                swap++;
                }
            }

        }
            
        for(int Element : arr){
            System.out.print(Element+" ");
           }
           System.out.println();
        System.out.println("Take's turns to sort the Array: "+swap);

    }
    //2. SELECTION SORT........
    public static void selectionSort(int arr[]){
      
        for(int i =0 ; i<arr.length-1; i++){
            int minpos = i;

            for(int j = i+1 ; j <arr.length ; j++){

                if(arr[minpos]> arr[j]){
                        minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]   = arr[i];
            arr[i]       = temp;
        }
        for(int element: arr){
            System.out.print(element+" ");
        }
    }

    //3. Insertion Sort............
    public static void insertionSort(int arr[]){
        
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && curr<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }   
            arr[prev+1] = curr; 
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }

    //4. Counting Sort........

    public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            largest = Math.max(arr[i], largest);
        }

        int count[] = new int[largest+1];
        for(int i =0 ; i< arr.length ; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i = 0 ; i<count.length ; i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
        for(int element : arr){
            System.out.print(element+" ");
        }
    }

    public static void printArr(int arr[]){
        for(int i= 0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // merge Sort....

    public static void mergeSort(int arr[] , int si , int ei){

        // base case
        if(si>=ei){
            return;
        }

        // finding the mid
        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, ei, mid);
        
    }

    public static void merge(int arr[] , int si , int ei , int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0 ;

        while(i<= mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++; 
        }

        // for reamin left left element
        while(i<=mid){
            arr[k++] = arr[i++];
        }


        //  for remain right element...
        while(j<= ei){
            temp[k++] = arr[j++];
        }


        // copy element from temporary Array to Main Array...
        for(k=0,i=si ; k<=temp.length-1; k++ ,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
    // int arr[] = {4,5,6,2,3,1,7};
    // System.out.println("Bubble Sort....\n");
    // bubbleSort(arr);
    // System.out.println("Selection Sort...\n");
    // selectionSort(arr);
    // System.out.println();
    // System.out.println("Insertion Sort.....\n");
    // insertionSort(arr);

    // int arr3[] = {1,5,2,3,6,8,9,7,4};
    // Arrays.sort(arr3);
    // System.out.println("\n");
    // System.out.println("Counting Sort");
    // countingSort(arr);
    int arr[] = {2,5,6,3,8,6,7,9,10};
    mergeSort(arr, 0, arr.length-1);
    printArr(arr);
   }
}
        