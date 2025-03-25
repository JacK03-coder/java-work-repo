/*
 * pattren Printting -->>> 
 */
import java.util.Scanner;

class Day_06_10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * pattren *
         *         * * 
         *         * * * 
         *         * * * * 
         */
        System.out.println("Enter A number: ");
        int num = scan.nextInt();

        for(int i =0 ; i<=num ; i++){
            for(int j =0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /* Pattren -->>   * * * * 
                          * * *
                          * *
                          *
         
         */

        System.out.println("Enter an number: ");
        int num1 = scan.nextInt();

        for(int i = 0 ; i<= num1; i++){
            for(int j = 0 ; j<num1-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * Half Pyramid-->>  1
         *                   1 2
         *                   1 2 3 
         *                   1 2 3 4
         */

         System.out.println("Enter An number: ");
         int num2 = scan.nextInt();
         int value = 0;

         for(int i = 1; i<= num ; i++){
            for(int j = 1 ; j< i ;j++){
                System.out.print(j);
            }
            System.out.println();
         }

         /*
          * Character Printing-->>
                    A
                    B C
                    D E F 
                    G H I J 
          */

          System.out.println("Enter asn number: ");
          int num3 = scan.nextInt();
          char ch = 'A';

          for(int i = 0 ; i<=num ; i++){
            for(int j =0 ; j<i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
          }

    }
}