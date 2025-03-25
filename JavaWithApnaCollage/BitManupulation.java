
import java.util.Scanner;

public class BitManupulation {
    public static void checkevenodd(int num){

        int bitmask = 1;
        if((num & bitmask) == 0){
            System.out.println("even");
        }else
            System.out.println("Odd");
    }

    public static int getIthBit(int num , int i){
        if((num & (1<<i) )==0){
            return 0;
        }else
            return 1;
    }

    public static int setIthBit(int num , int i){
         int bitmask = 1<<i ; 
         return num | bitmask;
    }

    public static int clearIthBit(int num ,int i){
        int Bitmask =  ~(1<<i);
        return num & Bitmask ;
    }

    public static int clearIBit(int num , int i){
        int bitmask = (~0)<< i ;
        return num & bitmask;
    }

    public static int claerIBitsInRange(int num , int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1 ; 
        int bitmask = a|b;
        return num & bitmask;
    }

    public static boolean  isPowerOfTwo(int num){
        // if((num & (num-1) )==0){
        //     return true;
        // }
        // else
        //     return false;
        return (num & (num-1)) == 0;
    }

    public static int countOfSetBits(int num){
        int count = 0;
        while(num>0){
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int findExpo(int num , int pow){
       // return (int)Math.pow(num, pow);
       int value = 1;
       for(int i=1 ; i<= pow ; i++){
          value *= num;
       }
       return value;
    }

    public static int fastExponent(int num , int pow){

        int value = 1; 

        while(pow>0){
            if((pow & 1) != 0){
                value *= num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return value;
    }

    public static  int modulerExponent(int num , int pow , int mod){
        int value =1 ;

        while(pow> 0){
            if((pow & 1) != 0){
                value *= num ;
            }
            num = num * num;
            pow= pow >> 1;
        }

        int value2 = (num % mod);

        return value2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter An Number:: ");

        System.out.println(getIthBit(10, 3)); 
        
        System.out.println(setIthBit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(clearIBit(15, 2));

        System.out.println(claerIBitsInRange(10, 2, 4));

        System.out.println(isPowerOfTwo(7));

        System.out.println(countOfSetBits(7));

        System.out.println(findExpo(2, 7));

        System.out.println(fastExponent(3, 5));

        System.out.println(modulerExponent(50, 100, 13));
    }
}
 