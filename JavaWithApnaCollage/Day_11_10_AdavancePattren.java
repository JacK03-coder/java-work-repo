
import java.util.Scanner;

//1.hollow ractangle...
public class Day_11_10_AdavancePattren {
    public static void hollow_rectangle(int totrow , int totcol){
        for(int i = 1 ; i<=totrow ; i++){
            for(int j = 1 ; j<=totcol ; j++){
                if(i==1 || i==totrow || j==1 || j==totcol){
                    System.out.print("* ");
                }
                else
                     System.out.print("  ");// their is two spaces are used it is very important here  manage space if you want to print currect pattren otherwise you will see the output which is not febrable
                }
                System.out.println();
            }
        }

        //2.Inverted Half Pyramid

        public static void inverted_HalfPyramid(int num){
               
            for(int i =1; i<=num ; i++){
                for(int j=1 ; j<=num-i; j++){
                    System.out.print(" ");
                }
                for(int j=1 ; j<=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //3. Inverted Hald Pyramid with number's 

        public static void inverted_half_pyrd_Number(int totrow , int totcol){
            for(int i = 1 ; i<= totrow ; i++){
                for(int j= 1; j<=totcol-i+1 ; j++){
                    System.out.print(" "+j);
                }System.out.println();
            }
        }
           
        //4. Floyd's Triangle
        public static void FloydTriangle(int num){
            int number = 1;
            for(int i =1 ; i<= num ; i++){
                for(int j = 1 ; j<=i ; j++){
                    System.out.print(number+"  ");
                    number++;
                }System.out.println();
            }
        }

        //5. 0-1 Triangle:::
        public static void triangleBinary(int num){

            for(int i = 1 ; i<=num ; i++){
                for(int j =1 ; j<=i ;j++){
                    if((i+j)%2==0){
                        System.out.print(" 1");
                    }
                    else 
                        System.out.print(" 0");
                }
                System.out.println();
            }
        }

        //6. Butterfly Pattren::::

        public static void butterFlyPattren(int num){

            for(int i = 1 ; i <= num ; i++){

                for(int j =1 ; j<=i ; j++){
                    System.out.print(" * ");
                }

                for(int j=1 ; j<= 2*(num-i) ; j++){
                    System.out.print("   ");
                }

                for(int j =1 ; j<=i ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

            for(int i = num; i>=0 ; i--){
                
                for(int j =1 ; j<=i ;j++){
                    System.out.print(" * ");
                }

                for(int j =1 ; j<=2*(num-i) ; j++){
                    System.out.print("   ");
                }

                for(int j= 1 ; j<=i ; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        //7. Rhombus Pattern:::::

        public static void rhombusPattern(int num){
            for(int i = 1 ; i<=num ; i++){
                for(int j =1 ; j<=num-i ; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j<=num; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //8. Hollow Rhombus::::
        public static void hollowRhombus(int num){

            for(int i=1 ; i<=num ; i++){

                for(int j =1 ; j<=num-i ; j++){
                    System.out.print(" ");
                }

                for(int j =1 ; j<=num ; j++){
                    if(i==1 || i==num || j==1 || j==num){
                        System.out.print("*");
                    }
                    else 
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        
        //9. Diakmond Pattern:::

            public static void diamondPattern(int num){

                for(int i =1 ; i<=num ; i++){
                    for(int j =1 ; j<=num-i; j++){
                        System.out.print(" ");
                    }
                    for(int j =1; j<=(2*i)-1 ; j++){
                        System.out.print("*");
                    } 
                    System.out.println();
                }

                for(int i= num ; i>=1; i--){
                    for(int j=1 ; j<=num-i ;j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=(2*i)-1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
            }

            //Equlatral Triangle....
            public static void triangleEq(int num){

                for(int i = 0 ; i<= num ; i++){
                    for(int j=1 ; j<=num-i ; j++){
                        System.out.print(" ");
                    }
                    for(int j=1 ; j<=(2*i)-1 ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*1. Hollow Ractangle...       * * * * *  
                                       *       *
                                       *       * 
                                       * * * * *   
        */  
     //   hollow_rectangle(3, 4);   
        
        /*
         * 2.Inverted Half Pyramid              *
         *                                   *  *
         *                                *  *  *
         *                             *  *  *  *
         */

         inverted_HalfPyramid(15);

         /*
          *3.Inverted Half Pyramid With Number's ::  1 2 3 4 5 
                                                     1 2 3 4
                                                     1 2 3
                                                     1 2
                                                     1
          */
         
          inverted_half_pyrd_Number(15, 15);

        /*
         *4.Floyd's triangle :: 1
         *                      2  3
         *                      4  5  6
         *                      7  8  9  10
         *                      11 12 13 14  15
         */

         FloydTriangle(15);

         /*
          *5.0-1 Triangle:::    1
                                0 1
                                1 0 1
                                0 1 0 1
                                1 0 1 0 1   
          */

        triangleBinary(15);

        /*
         *6. Butterfly Triangle :: 
         * 
         *              *             *
         *              * *         * *
         *              * * *     * * *
         *              * * * * * * * * 
         *              * * * * * * * *
         *              * * *     * * *
         *              * *         * *
         *              *             *
         */   
        
         butterFlyPattren(15);

         /*
          *7.Rhombus Pattern :::     
                                            * * * * * * 
                                          * * * * * *
                                         * * * * * *
                                        * * * * * *
                                       * * * * * *
                                     * * * * * *
          */  
          rhombusPattern(15);

          /*
           *8.Hollow Rhombus::::     * * * * *
           *                        *       *
           *                       *       * 
           *                      *       *
           *                     * * * * *
           */

           hollowRhombus(15);


           /*
            * Diamond Pattern :::                                           *
                                                                          * * *
                                                                        * * * * *
                                                                      * * * * * * * 
                                                                       * * * * * * 
                                                                        * * * * * 
                                                                          * * *
                                                                            *
            */

            diamondPattern(15);

        /*
         * Equilatral Triangle:::                                *
         *                                                     * * *
         *                                                    * * * * 
         *                                                   * * * * * 
         *                                                  * * * * * * 
         */

            triangleEq(15);
    }
}
