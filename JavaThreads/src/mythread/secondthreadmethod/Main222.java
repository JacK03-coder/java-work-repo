package mythread.secondthreadmethod;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main222 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // for(int i=1 ; i<10 ; i++){
        //     System.out.println(factorial(i));
        // }




        //<<<<<<<<<<<<<<<<<<<<<<< Not Necessary >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // System.out.println("Total Time:: " + (System.currentTimeMillis() - startTime));

        // Runnable factorialll = new Runnable() {
        //     @Override
        //     public void run() {
        //         factoriall();
        //     }
        //         void factoriall(){
        //         for(int i =1 ; i<=10 ; i++){
        //             long finali = i;
        //             System.out.println(factorial(i));
        //         }
        //     } 
        // };

        // Thread Factorialnum = new Thread(factorialll);
        // Factorialnum.start();


        startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
      for(int i=1 ; i< 10 ; i++){
        int resulti = i;
         executor.submit(
            ()-> {long result = factorial(resulti);
            System.out.println(result);
            }
        );
      };
      executor.shutdown();
      try {
        while(!executor.awaitTermination(1, TimeUnit.MILLISECONDS)){

        }
        
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
      System.out.println("Total time: "+(System.currentTimeMillis()-startTime));
    
    }

    public static long factorial(int n){
       try{
        Thread.sleep(1000);
       }catch(Exception e){
       }
        int result =1;

        for(int i=1 ; i<=n ; i++){
            result *= i;
        }
        return result;
    }
}
