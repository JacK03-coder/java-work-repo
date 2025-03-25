public class Day_19_11_BackTracking {

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // public static void addElement(int arr[] , int n){
    //     if(n == 0){
    //         return;
    //     }
        // int i =0;
        // int k = 1;
        // for(i=0; i<n ; i++){
        //     arr[i] = k;
        //     k++;
        //     addElement(arr, n-1);
        // }
    //     arr[n-1] = n;
    //     addElement(arr, n-1);
    // }

    public static void changeArr(int arr[] , int i , int val){

        // base case...
        if(i == arr.length){
            printArr(arr);
            return;
        }
        // adding Element on Arrays....
        arr[i] = val;
        // recusive call....
        changeArr(arr, i+1, val+1);
        //BackTracking call....
        arr[i]  = arr[i]-2;
    }

    public static void subString(String str , String ans, int i){
        if(i == str.length()){
            if(ans.length()==0){
                System.out.print("NULL");
            }
            System.out.println(ans);
            return;
        }

        // recursion call for Yes..
        subString(str,ans+str.charAt(i), i+1);

        // recursion call for No...
        subString(str, ans, i+1);
    }

    public static void findPermutation(String str , String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0 ; i< str.length() ; i++){
            char curr = str.charAt(i);

            String newStr = str.substring(0,i) +str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    } 
      
    public static void main(String[] args) {
        // int n = 5;
        // int arr[] = new int[n];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // String str = "abc";
        // subString(str, "", 0);
        String str = "abc";
        findPermutation(str, "");
    }
}
