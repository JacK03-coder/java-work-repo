
import java.util.Scanner;

public class Day_31_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Swap Number's Of Array's  Using XOR Operator.........");
        int [] arr = {2,6,53,65,96,49,69,65,96,566,65,69};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        for (int i = 0 ; i<n ; i++){
            //swap the number's using XOR Operator.........
            arr[i] = arr[i]^arr[l-1-i];
            arr[l-1-i] = arr[i] ^ arr[l-1-i];
            arr[i] = arr[i] ^ arr [l-1-i];
        }

        for(int element : arr){
            System.out.println(element);
        }

        System.out.println("Again Doing for Fun");
        int [] name = {2,6,56,9,685,99,656,658,62,56,35,69,56,85,64,69,659,69};
        int L = name.length;
        int N = Math.floorDiv(L, 2);
        for(int i =0 ; i<N ; i++){
             name[i] = name[i]^ name[L-1-i];
             name[L-1-i] = name [i] ^ name [L-1-i];
             name[i]  = name[i] ^ name[L-1-i];
        }
            for(int element : name){
                System.out.println(element);
            }
            
            System.out.println("");
            String R = scan.nextLine();
            String A = new String();
            for(int i =R.length()-1 ; i>=0 ;  i--){
                A = A+R.charAt(i);
            }
            if(R.equals(A)){
                System.out.println("String is Palindrom...");
            }    else
                    System.out.println("String is not Palindrom......");



                    System.out.println("Enter the size of Array : ");

                    int arr_size = 0;
                    if(scan.hasNextInt()){
                        arr_size = scan.nextInt();
                    }
                    int [] marks = new int [arr_size];
                    System.out.println("Enter the Element of array : ");
                    for(int i =0 ; i<arr_size ; i++){
                        if(scan.hasNextInt()){
                           marks[i] =scan.nextInt();
                        }
                    }

                    System.out.println("Element of The Array are: ");
                    for(int i = 0 ; i< arr_size ; i++){
                        System.out.println(marks[i]+" ");
                    }
    }
}
