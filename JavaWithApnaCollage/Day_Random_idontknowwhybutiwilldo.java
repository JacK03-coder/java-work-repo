
import java.util.Scanner;

public class Day_Random_idontknowwhybutiwilldo {

    public static void tringle(int num){

        for(int i=0 ; i< num ; i++){
            for(int j=1 ; j< num-i ; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1 ; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int n = scan.nextInt();

        for(int i =0 ; i <= n ; i++){
            for(int j=i ; j>=0 ; j--){
                if(j%2==0){
                    System.out.print(1+" ");
                }else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
        
        tringle(5);
    }
}
