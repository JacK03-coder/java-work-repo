/*
 * !!Exception class in java--->>> So Basically as much as  i understood that concept.. in this code i am using getMessage & toString method of Exception class ..
 * The getMessage method is used to return the specific reason of the exception..
 * The tostring also return the exception  after the name of the exception  class...
 * i really don't know i write right or wrong  but this is what i understand's...
 */

import java.lang.classfile.CodeBuilder;
 import java.util.*;
 class MyException extends Exception{
    public String toString(){
        return  "I am  toString";
    }

    public String getMessage(){
        return "I am getMessage";
    }
 }
public class Day_30_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<10){
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e);

            }
        }  
    }
}
