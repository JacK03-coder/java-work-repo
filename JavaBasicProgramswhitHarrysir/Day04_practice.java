import java.util.Scanner;

public class Day04_practice {

    static void maltiplication(int n){
        for(int i= 1 ; i<=10 ; i++){
            System.out.format("%d X %d = %d \n",n , i ,n*i);
        }
    }

    static void pattern1(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print("*\t ");
            }System.out.println();
        }
    }
    static int sum(int n){
        if(n==1){
            return 1;
        } return n + sum(n-1);
    }

    static void pattren2(int n){
        for(int i = n ; i>=1;i--){
            for(int j =1 ; j<=i ;j++){
                System.out.print("*\t");
            }System.out.println();
        }
    }
    static int fabonnciSeries(int n){
        // if(n==1){
        //     return 0;
        // } 
        // else if(n==2){
        //     return 1;
        // }
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fabonnciSeries(n-1)+fabonnciSeries(n-2);
        }
    }

    static void pattren3(int n){
        if(n>0){
            pattren2(n-1);
            for(int i = 0; i<n; i++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The table is : ");
        maltiplication(7);
        int c = sum(10);
        System.out.println(c);
        pattern1(5);
        System.out.println();
        System.out.println();
        pattren2(5);
        int result = fabonnciSeries(8);
        System.out.println(result);
        pattren3(5);
    }
}
