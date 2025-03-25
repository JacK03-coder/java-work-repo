import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOprDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //1. COLLECT()...
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(2).toList().forEach(x-> System.out.println(x));    // we can use direct to List-List method without Collector... (in new java version)


        //2. FOR- EACH()...
        list.stream().forEach(x-> System.out.println(x));

        //3. REDUCE() :: combines element to produce a single result...
        Optional<Integer> rlist =  list.stream().reduce((x,y)->x+y);
        System.out.println(rlist.get());

        //COUNT()...        
        System.out.println(list.stream().filter(x-> x%2==0 ).count());


        //<<<<<<<<<<<<<<<<<<<<<<<<< Short - Circuit method's >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // 1. ANY-MATCH() , 2. ALL-MATCH() , 3. NON-MATCH()...
        boolean b = list.stream().anyMatch(x ->x % 2 ==0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x-> x>0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x<0);
        System.out.println(b2);

        // 1. FIND-FIRST()  , 2.FIND-ANY()...
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().skip(1).findAny().get());


        // <<<<<<<<<<<<<<<<<<<<<<---EXAMPLE--->>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        List<String> names = Arrays.asList("Anna" , "BOb" , "Charlie" , "David" ,"chaplin");

        // Filtering and collecting Names...

        System.out.println(names.stream().filter(x-> x.length()>3).toList());

        //2. Squaring and sorting list...
        
        List<Integer> numbers = Arrays.asList(2,3,5,6,9,7);

        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        //3. Summing values...
        System.out.println(numbers.stream().reduce(Integer::sum).get());  // by method refrance..
        System.out.println(numbers.stream().reduce((x,y)-> x+y).get());

        //4. Counting Occurance of a Character's...

        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x-> x == 'o').count()); 

        
        List<String> personName = Arrays.asList("Alice" , "Bob" , "Charlie", "David", "Chaplin");

        Stream<String> newStream = personName.stream()
        .filter(name -> {
            System.out.println("Filtering: " + name);
            return  name.length() > 3;  
        });

        System.out.println("Before terminal operation");

        List<String> result = newStream.collect(Collectors.toList());
        
        System.out.println("List after terminal operation");
        System.out.println(result);




        //<<<<<<<<<<<<<<<<<<<Parallel-Stream>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            //  A type of stream that enable's Parallel pocessing of element's
            // Allowing multiple threads to process parts of the stream simultaneously
            // this can sgnificantly improve performance for large data set
            // workload is distributed across multiple threads 
            // Parallel Stream are most effective for CPU-intensive or large data set where task are indepedent 
            // but they may add overhead for simple task or small data set's

        System.out.println();
        System.out.println();
        System.out.println();


        List<Integer> intNumber = Stream.iterate(1, x-> x+1).limit(1000).toList();

        //5.Sequential Stream...
        long startTime = System.currentTimeMillis();
        List<Long> factorialStream = intNumber.stream().map(x->factorial(x)).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Sequential Time: "+(endTime - startTime) +" ms");

         //6. Parallel Time...
        startTime = System.currentTimeMillis();
        factorialStream = intNumber.parallelStream().map(x->factorial(x)).toList();
        endTime  = System.currentTimeMillis();

        System.out.println("Parallel time: "+(endTime - startTime)+" ms");


        //7. ToARRYA()...

        Object[] array = Stream.of(1,2,3,4,5,6,7).toArray();
        for(Object i : array){
            System.out.println(i);
        };

        //8. MIN() / MAX() ...

        System.out.println("max: "+Stream.of(33,43,456,3,5,643,34).max((x,y)-> x-y).get());
        System.out.println("min: "+Stream.of(33,43,456,3,5,643,34).min(Comparator.naturalOrder()).get());



        // Cumulative Sum
        
        List<Integer> numberss = Arrays.asList(1,2,3,4,5);
        AtomicInteger   sum = new AtomicInteger(0);
        List<Integer> acumulativeSum = numberss.stream().map(x-> sum.addAndGet(x)).toList();

        System.out.println("Expected Sum [1,3,6,10,15]");
        System.out.println("Actual result:"+ acumulativeSum);

        

    }


    private static long factorial(int n){
        long result = 1;
        for(int i=0 ; i<=n ; i++){
            result *= i;
        }
        return result;
    }
}
