import java.util.Scanner;
import javax.print.attribute.Size2DSyntax;

public class Day_31_08_02 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        // System.out.println("Enter the Size of String you want to  print: ");
        // int arr_size = 0;
        // if(scan.hasNextInt()){
        //         arr_size = scan.nextInt();
        // }

        // int [] arr = new int[arr_size];

        // System.out.println("Enter Element's of Array: ");
        // for(int i=0 ; i< arr_size ; i++){
        //     if(scan.hasNextInt()){
        //         arr[i] = scan.nextInt();
        //     }
        // }
        // System.out.println("Element's of Array are: ");

        // for(int i=0; i<arr_size ; i++){
        //     if(scan.hasNextInt()){
        //         System.out.print(arr[i]+"  ");
        //     }
        
        // }

        // System.out.println("Swaping Array element's...");

        // int[] name = {54,65,9,6549,665,965,9669,66964,65,69};
        // int l = name.length;
        // int n = Math.floorDiv(l, 2);
         
        // for(int i = 0 ; i<n ; i++){
        //     name[i]  =  name[i] ^ name[l-1-i];
        //     name[l-1-i] = name[i] ^ name[l-1-i];
        //     name[i] = name[i] ^ name[l-1-i];
        // }

        // for(int element : name){
        //     System.out.println(element);
        // }

        // System.out.println("Enter the size of Array : ");
        // int arr_size = 0; 
        // if(scan.hasNextInt()){
        //     arr_size = scan.nextInt();
        // }

        // int [] arr = new int[arr_size];

        // System.out.println("Enter the Element's of array : ");
        // for(int i=0 ; i<arr_size ; i++){
        //     if(scan.hasNextInt()){
        //          arr [i] = scan.nextInt();
        //     }
        // }
        // System.out.println("Element's of array are : ");

        // for(int i = 0 ;  i< arr_size ; i++){
        //     System.out.println(arr[i]+"");
        // }

        System.out.println("Enter the string you want to   check :");
        String name = scan.nextLine();
        String N = new String();
        for(int i = name.length()-1 ; i>=0 ; i--){
            N = N + name.charAt(i);
        } 
        if(name.equals(N)){
            System.out.println("string is palindrom..");
        }else 
            System.out.println("string is not palindrom..");
    }

}

