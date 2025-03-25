
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class IterableInJava {
    public static void main(String[] args) {
        // List<Integer>  numbers = new CopyOnWriteArrayList<>();
    //      numbers.add(1); numbers.add(2); numbers.add(3);
    //      numbers.add(4); numbers.add(5);numbers.add(6); numbers.add(7);
    //      numbers.add(8); numbers.add(9); numbers.add(10);

    //     for(int num: numbers){
    //         if(num % 2 == 0){
    //             numbers.remove(num);
    //         }
    //     }

    //    Iterator<Integer> itr = numbers.iterator();
    //    while(itr.hasNext()){
    //     Integer num  = itr.next();
    //     if(num % 2 != 0){
    //         itr.remove();
    //      }
    //   }

    //    System.out.println(numbers);


    //<<<<<<<<<Lambda Expression>>>>>>>>>>>>>>>>>>>

    ArithmaticOps addition = (a,b)-> a+b;
    ArithmaticOps sub = (a,b)-> a-b;
    System.out.println(addition.operation(5, 3));
    System.out.println(sub.operation(4, 2));



    //<<<<<<<<<<<<<<<<Predicator's>>>>>>>>>>>>>>>>>>>
    Predicate<Integer> isEven = x -> x%2==0;
    System.out.println(isEven.test(36));

    Predicate<String> isstartWithS = x -> x.toLowerCase().startsWith("j");
    Predicate<String> isEndsWithA  = x->  x.endsWith("k");
    Predicate<String>  Twopredicator = isstartWithS.and(isEndsWithA);
    System.out.println(isstartWithS.test("jack"));
    System.out.println(Twopredicator.test("jack"));


    //<<<<<<<<<<<<<<<Interface Function>>>>>>>>>>>>>>

    Function<Integer , Integer> doubleIt = x -> 2 * x ;
    Function<Integer , Integer> tripleIt = x -> 3 * x ;

    System.out.println(doubleIt.apply(2));
    System.out.println(tripleIt.apply(3));

    System.out.println(doubleIt.andThen(tripleIt).apply(4));
    System.out.println(tripleIt.andThen(doubleIt).apply(4));
    System.out.println(doubleIt.compose(tripleIt).apply(4));

    Function<Integer , Integer> identity = Function.identity();
    Integer result = identity.apply(5);
    System.out.println(result);


    //<<<<<<<<<<<<<<<<<<<<<<<<<Consumer>>>>>>>>>>>>>>>>>>>>>

    // Don't forget to import package.. Damnnn man.....
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(56);
        print.accept(45);

        
       List<Integer> list = Arrays.asList(1,2,3,4,5);

       Consumer<List<Integer>> printlist = x -> {
            for(int i : x ){
                System.out.println(i);
            } 
       };

       printlist.accept(list);


       //<<<<<<<<<<<<<<<<<<<<Combined Example using all of the  method's>>>>>>>>>>>>>>>>>>>>>>

       Predicate<Integer> predicate = x -> x % 2 == 0;
       Function<Integer,Integer> function = x -> x * x ;
       Consumer<Integer> consumer = x -> System.out.println(x);
       Supplier<Integer> spplier = () -> 3;


       if(predicate.test(spplier.get())){
        consumer.accept(function.apply(spplier.get()));
       }

       //<<<<<<<<<<<<<<<<<<<<<<<<<Double Argument>>>>>>>>>>>>>>>

       BiPredicate<Integer ,Integer> biPredicate = (x,y) -> (x+y) % 2 == 0;
       BiConsumer<Integer , Integer> biConsumer  = (x,y) -> {
        System.out.println(x);
        System.out.println(y);
       };

       BiFunction<String ,String , Integer> biFunction = (x,y) -> (x+y).length();
       System.out.println(biFunction.apply("jay", "arya"));


       //  Method  refrence -> use method without invoking & in place of lambda expression.......

       List<String> student = Arrays.asList("thor" , "tony", "hulk");
       student.forEach(x->System.out.println(x));
       student.forEach(System.out::println);
    }
}
@FunctionalInterface
interface ArithmaticOps{
    int operation(int a, int b);
}