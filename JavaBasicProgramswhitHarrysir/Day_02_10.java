/*
 * creating an calculator with custom exception class... it sound instersting naa.. let's see how it goes..
 * it throw exception's like :: 1.InvalidInputException , 2. CannotDevideByZeroException , 3.MaxInputException , 4.MaxMultiplierReachedException...
 * let get start...
 * One thing more this is my first maximum line code [*_*] ....
 * 
 */
import java.util.*;

class InvalidInputException extends Exception{
    public InvalidInputException(String message){
        super(message);
    } 
}

class CannotDivideByZeroException extends Exception{
    public CannotDivideByZeroException(String message){
        super(message);
    }
}

class MaxInputException extends Exception{
    public MaxInputException(String message){
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception{
    public MaxMultiplierReachedException(String message){
        super(message);
    }
}

class calculator{
    private static final int MAX_INPUT = 100000;
    private static final int MAX_MULTIPLIER  = 10000;

    public double add(double a , double b) throws MaxInputException{
        if(a>MAX_INPUT||b>MAX_INPUT){
            throw new MaxInputException("Input Exceeds The Max Allowed Limit: "+MAX_INPUT);
        }
        return a+b;
    }

    public double subtract(double a , double b) throws MaxInputException{
        if(a>MAX_INPUT || b> MAX_INPUT) {
            throw new MaxInputException("Input Exceed The Max Allowed Limit: "+MAX_INPUT);
        }
        return a-b;
    }

    public double multiply(double a , double b) throws MaxInputException  , MaxMultiplierReachedException{
        if(a>MAX_INPUT || b>MAX_INPUT){
            throw new MaxInputException("Input Exceed The Max Allowed Limit: "+MAX_INPUT);
        }
        if(a>MAX_MULTIPLIER || b>MAX_MULTIPLIER){
            throw new MaxMultiplierReachedException("Multiplier Exceed The  Max Allowed Limit: "+MAX_MULTIPLIER);
        }
        return a*b;
    }

    public double divide(double a , double b) throws MaxInputException , CannotDivideByZeroException{
        if(a>MAX_INPUT || b>MAX_INPUT){
            throw new MaxInputException("Input Exceed The Max Allowed Limit: "+MAX_INPUT);
        }
        if(b==0){
            throw new  CannotDivideByZeroException("Cannot Divide By Zero");
        }
        return a/b;
    }
}
public class Day_02_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calculator calculator = new calculator();
        boolean flag = true;

        while(true){

        try {
            System.out.println("Choose Operation : \n 1.For addition \n 2.For Substraction \n 3.For Multiplication \n 4. For Division \n5. For Exit.!");
            int choice = scan.nextInt();

            if(choice<1 || choice>5){
                throw new InvalidInputException("Invalid Operation Chosen..!!");
            }
            if(choice ==5){
                flag = false;
                System.out.println("Calculator Is Exited.!!");
                break;

            }
            System.out.println("Enter First Number : ");
            double num1= scan.nextDouble();
            System.out.println("Enter Second Number: ");
            double num2 = scan.nextDouble();
            double result = 0;
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;   
                case 3:
                    result = calculator.multiply(num1, num2);
                    break; 
                case 4:
                    result = calculator.divide(num1, num2);
                    break; 
            }
            System.out.println("Result is : "+result);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
        catch(CannotDivideByZeroException e){
                System.out.println(e.getMessage());
        }
        catch(MaxInputException e){
            System.out.println(e.getMessage());
        }
        catch(MaxMultiplierReachedException e){
            System.out.println(e.getMessage());
        } 
        
      }
    }
}
