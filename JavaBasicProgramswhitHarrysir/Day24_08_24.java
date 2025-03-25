
public class Day24_08_24 {
    public static void main(String[] args) {
        int a =0 , b = 0;
        System.out.println("Using While loop");
        while(a<5){
            System.out.println(a);
            a++;
        }
        System.out.println("Using do while while loop.. ");
        do{
           System.out.println(b); 
           b++;
        }while(b<6);

        System.out.println("Using FOr Loop!");
        for  (int i=1 ;i<=10; i++){

            System.out.println(i);
        }


       // Odd Even number using for loop....
         System.out.println("even numbers....");

         for(int i = 0; i<100;i++){
            System.out.println(2*i+1);
         }

         System.out.println("Odd numbers....");
         for (int i = 1; i < 100;i++) {
           System.out.println(2*i);
         }
        
         System.out.println("Reverse order of natural numbers...");

         for(int i=6;i>0;i--){
            System.out.println(i);
            System.out.println("hyy broo..");
            if(i==3){
                System.out.println("Loop is over because of break statement....");
                break;
            }
         }

         //Array's......!!!!

         int [] marks = new int[3];
         marks[0] = 84;
         marks[1] = 94;
         marks[2] = 64;
        System.out.println(marks[1]); 

        int[] value = {100,23,45,32,56};
        System.out.println(value[4]);
    }
}
