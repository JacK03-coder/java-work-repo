
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.*;

  //introduced in java 8...
        // Process collection of data in a functional and declarative manner...
        //Simplify Data Processing...
        // Embrace functional  programming...
        //improve Readiability and Maintainbility...
        //Enable Easy Parallism... 

        // What is Stream :: sequece of element support various operation... also you can say  support functional and declarative programming..

        // [How to use Stream] ::: Source ->                               Intermediate Opearation's ->                   Terminal Operation's
        //                       provides the data  (collection , Array) -> Perfrom operation's like (Filter , map ) -> see the optput/result (for-each loop , collect)...  

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8);

        // Without Stream  In treditional way...
        int count = 0;
        for(int i: numbers){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        // Using Stream...
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());


        
        List<String> list = Arrays.asList("tony" , "thor" , "loki" , "hulk");

        // 1. FILTER() Method...
        Stream<String> filterstream = list.stream().filter(x -> x.startsWith("T"));
        // no filter this point wait for Terminal Opeartion...
        long result = list.stream().filter(x -> x.startsWith("t")).count();
        System.out.println(result);

        
        //2.MAp() method...
        Stream<String> mapStream = list.stream().map(x->x.toUpperCase());
        
        //3. SORTED() Method ...

        Stream<String> sortedStram = list.stream().sorted(); // sort in natural order.

        Stream<String> sortUsingComparator = list.stream().sorted((a,b)-> a.length() - b.length());

        //4.DISTICNT() Method...
        System.out.println("Distinct method");
        System.out.println(list.stream().filter(x-> x.startsWith("t")).distinct().count());

        //5. LIMIT() method...
        System.out.println(Stream.iterate(1, x->x+1).limit(100).count());
            
        //6.SKIP() method...
        System.out.println(Stream.iterate(1, x->x+1).skip(10).limit(100).count());

        //7.PEEK()... [Performs an action on each element as it is consumed.!!]
         //tream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

         //8. FLATMAP()...
         List<List<String>> listOfList = Arrays.asList(
            Arrays.asList("Apple","Banana"),
            Arrays.asList("Orange","kiwi"),
            Arrays.asList("Pear","grape")
         );

         System.out.println(listOfList.get(1).get(1));
         System.out.println(listOfList.get(0).get(1));

         System.out.println(listOfList.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList());

         List<String> sentences = Arrays.asList(
            "Hello world",
            "Java stream are powerful",
            "flatMap is useful"
         );
         System.out.println(sentences);

         System.out.println(sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());

         System.out.println(sentences.stream()
         .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
         .map(String::toUpperCase)
         .toList());

          



         // FOR-EACH_ORDER()...
         
         List<Integer> numberss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
         System.out.println(" Print via for-each terminal operation");
         numberss.parallelStream().forEach(System.out::println);
         
         System.out.println("Print via for-each-order terminal operation");
         numberss.parallelStream().forEachOrdered(x->System.out.println(x));
    }
}
