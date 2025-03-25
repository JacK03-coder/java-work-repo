    public class Day_25_10_RemoveDuplicate {

    public static int removeDuplicate(int arr[]){
        int count =0;
        for(int i=0 ; i< arr.length ; i++){
            if(i<arr.length-1 && arr[i]== arr[i+1]){
                continue;
            }
        else{
            arr[count]= arr[i];
            count++;
        }
        }
        
        for(int i=0; i< count ;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(arr.length);
        return count;
    }
        public static void main(String[] args) {
            int arr[]  = {1,1,2};
            System.out.println(removeDuplicate(arr));
        }
    }
