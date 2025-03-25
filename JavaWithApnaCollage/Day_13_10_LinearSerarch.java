public class Day_13_10_LinearSerarch {
    //1.
    public static int LinearSerarch(int arr[] , int key){
        for(int i =0 ; i<arr.length ; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    //2.
    public static String linearSearch11(String menu[] , String value){
        for(int i = 0 ; i<menu.length; i++){
            if(menu[i]==value){
                return menu[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        //1. Linear Search....for Integer value's...
        int arr[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15};
        int key = 3;
         int index = LinearSerarch(arr, key);
         if(index==-1){
            System.out.println("Not Found!");
         }else
          System.out.println("Key is at Index:: "+index);

        //2. Linear Search for String value's.....

        String menu[] = {"dosa" , "samosa" ,"chai" , "chole bhature", "coffee"};
        String value = "chai";
        String availableorNot = linearSearch11(menu, value);
        if(availableorNot==null){
            System.out.println("Not available!");
        }
        else    
            System.out.println("Available!");
    }  
}
