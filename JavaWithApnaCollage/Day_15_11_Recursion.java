
import java.lang.annotation.Target;
import java.util.Map;

public class Day_15_11_Recursion {

    public static void printDec(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int itrative(int n){
        int result = 1;
        if(n>1){
            for(int i=1 ; i<= n ; i++){
                result = result*i;
            } 
        }
        else if(n==0){
            return 1;
        }
        return result;
    }

    public static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumbers(n-1);
    }

    public static int fabonacciSeries(int n){
         if(n==1 || n==0){
            return n;
         } 
         int fb1 = fabonacciSeries(n-1);  
         int fb2 = fabonacciSeries(n-2);
         int fbn =  fb1+fb2;

         return fbn;
    }

    public static boolean isShorted(int arr[] ,int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        } 
        return isShorted(arr , i+1);
    }

    public static int checkFirstOccur(int arr[] , int key , int i){
        if( i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return checkFirstOccur(arr, key,i+1);
    }

    public static int lastOccur(int arr[] , int key , int i){
        // if(i== 0){
        //     return -1;
        // }
        // if(arr[i] == key){
        //     return i;
        // }
        // return lastOccur(arr, key, i-1);

        if(i == arr.length-1){
            return -1;
        }

        int isFound = lastOccur(arr, key, i+1);
        if(isFound==-1 && arr[i]== key){
            return i;
        }
        return isFound;
    }

    public static int findPower(int m ,int n){
        if(n==0){
            return 1;
        }
        return m*findPower(m,n-1);
    }

    public static int findPowerOptim(int m , int n){
        if(n==0){
            return 1;
        }
            //int fp1 = findPowerOptim(m, n/2)*findPowerOptim(m, n/2);
            int fp1 = findPowerOptim(m, n/2);
            int  fp = fp1*fp1;
            if(n%2 != 0){
             fp = m*fp;
            } 
            
            return fp;
        }

        public static int setTile(int n){
            if(n==0 || n==1){
                return 1;
            }
            // // vertically
            // int fnm1 = setTile(n-1);
            // // horigontally
            // int fnm2 = setTile(n-2);
            // // total tiles
            // int totway  = fnm1+fnm2;
            // return totway;
            return setTile(n-1) + setTile(n-2);
        }

        public static int friendsPair(int n){
            if(n==1 || n==2){
                return n;
            }
            //single 
            int fp1 = friendsPair(n-1);
            //Pair
            int fp2 = (n-1)*friendsPair(n-2);
            
            int totpair = fp1+fp2;
            return totpair;
        }

        public static void removeDuplicates(String str , int idx , StringBuilder newstr , boolean map[]){

            if(idx == str.length()){
                System.out.println(newstr);
                return;
            }
            
            char currchar = str.charAt(idx);

            if(map[currchar - 'a'] == true){
                removeDuplicates(str, idx+1, newstr, map);
            }
            else{
                map[currchar-'a'] = true ;
                removeDuplicates(str, idx+1, newstr.append(currchar), map);
            }
        }

        public static void printBinString(int n , int lastPlace , String str){
            if(n==0){
                System.out.println(str);
                return;
            }

            printBinString(n-1, 0, str+"0");
            if(lastPlace==0){
                printBinString(n-1, 1, str+"1");
            }
        }

        // Merge Sort------>>

        public static void printArr(int arr[]){
            for(int i=0 ; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void mergeSort(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid = si+(ei-si)/2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid+1, ei);

            merge(arr, si, ei, mid);
        }

        public static void merge(int arr[] , int si , int ei , int mid){

            int temp[] = new int[ei-si+1];
            int i= si;
            int j = mid+1;
            int k = 0;

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

            // for leftover element for 1st Sorted part...

            while(i<=mid){
                temp[k++] = arr[i++];
            }

            // for rightover element for 2nd sorted part..

            while(j<= ei){
                temp[k++] = arr[j++];
            }

            for(k=0,i=si; k<temp.length; k++ , i++){
                arr[i] = temp[k];
            }
        }

        // Quick Short---->>>>

        public static void printArr1(int arr[]){
            for(int i=0 ; i<arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        // fuction for Quick sort Recutsive-->>>

        public static void quickShort(int arr[] , int si , int ei){
            if(si>=ei){
                return;
            }
            //last element..

            int pIdx = partition(arr, si,ei);
            quickShort(arr, si, pIdx-1);
            quickShort(arr, pIdx+1, ei);

        }

        public static int partition(int arr[] , int si , int ei){
            int pivot = arr[ei];
            int i =-1;
            
            for(int j = si ; j<ei ; j++){
                if(arr[j]< pivot){
                    i++;
                    int temp = arr[j];
                    arr[j]  = arr[i];
                    arr[i]   = temp;  
                }
            }

            i++;
            int temp  = pivot;
             arr[ei]  = arr[i];
             arr[i]   =  temp;

             return i;
        }

        // searching an element by rotates sorted Array..

        public static int search(int arr3[] , int si , int ei , int target){
            
            if(si> ei){
                return -1;
            }
            // finding Mid we can also use (a+b)/2...
            int mid = si+(ei-si)/2;

            if(target == arr3[mid]){
                return mid;
            }

            //mid on L1...

            if(arr3[si]<= arr3[mid]){
                //case 1: Left

                if(arr3[si]<= target && target<=arr3[mid]){
                    return search(arr3, si, mid-1, target);
                }
                // case 2: Right
                else{
                    return search(arr3, mid+1, ei, target);
                }
            }
            // mid on L2...
            else {
                    // case 3 : right
                    if(arr3[mid]<=target && target<= arr3[ei]){
                        return search(arr3, mid+1, ei, target);
                    }
                    // case 4: left
                    else{
                        return search(arr3, si, mid-1, target);
                    }
                } 
            
        }
    public static void main(String[] args) {
        int n =10;
        printDec(n);
        printInc(n);
       System.out.println(factorial(5)); 
       System.out.println(itrative(5));
       System.out.println(sumOfNaturalNumbers(5));
       System.out.println(fabonacciSeries(5));
       int arr1[] = {1,2,3,4,5,6,7,8,5,9};
       System.out.println(isShorted(arr1, 0));
       System.out.println(checkFirstOccur(arr1,5,0));
       System.out.println(lastOccur(arr1, 5, arr1.length-1));
       System.out.println(findPower(2, 7));
       System.out.println(findPowerOptim(2, 5));
       System.out.println(findPowerOptim(2, 6));
       System.out.println(setTile(7));
       String str = "appnacollege";
       StringBuilder newstr = new StringBuilder();
        boolean map[] = new boolean[26];
       removeDuplicates(str, 0, newstr, map);   
       System.out.println(friendsPair(4));
       printBinString(3, 0, "");

       // Merge Sort...

       int arr[] = {6,3,9,5,2,8};
       mergeSort(arr, 0, arr.length-1);
       printArr(arr);

       // Quick Sort-->>

       int arr2[] = {6,3,9,5,2,8,-3,-1};
       mergeSort(arr2, 0, arr2.length-1);
       printArr(arr2); 

       // searching element using recursion...

       int arr3[] = {0,4,6,8,9,10,5,15,3,45};
       int target = 15;
       int element = search(arr3, 0, arr3.length-1, target);
       System.out.println(element);
    }
} 
