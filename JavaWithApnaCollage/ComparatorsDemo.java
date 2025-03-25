
import com.sun.source.tree.Tree;
import java.lang.classfile.attribute.SourceFileAttribute;
import java.lang.reflect.Array;
import java.text.CollationKey;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ComparatorsDemo {
    public static void main(String[] args) {
        // Collection is a utility class...
        //Provide a set of method's to create common collection...


        //1. COLLECTING TO A LIST...
        List<String>  names = Arrays.asList("ALice","BOb","Charlie");
        List<String> a = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
        System.out.println(names.stream().filter(name -> name.startsWith("B")).collect(Collectors.toList()));

        System.out.println(names.stream().filter(x -> x.toLowerCase().startsWith("c")).collect(Collectors.toList()));


        //2. COLLECTING TO A SET...

        List<Integer> num = Arrays.asList(1,2,9,2,3,4,5,7,6,7,8,9,9);
        System.out.println(num.stream().collect(Collectors.toSet()));

        //3. COLLECTING TO A SPECIFIC COLLECTION...

        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(()-> new ArrayDeque<>()));
        System.out.println(collect);
        

        //4. JOINING() STRING'S ...[Concatenat's stream elements into single string] !! 

        String concetenatedString = names.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
        System.out.println(concetenatedString);

        //5. SUMMRIZING DATA...[Generates statistical summary (count ,sum , min , average , max)] !!

        List<Integer> numbers  = Arrays.asList(2,3,5,7,11);

        IntSummaryStatistics stats =  numbers.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("Count: "+stats.getCount());
        System.out.println("sum: "+stats.getSum());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());

        //6. CALCULATING AVERAGE ...
        double average = numbers.stream().collect(Collectors.averagingDouble(x->x));
        double average1 = numbers.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(average1);
        System.out.println(average);

        //7.COUNTING ELEMENT...
        long count = numbers.stream().collect(Collectors.counting());
        System.out.println(count);


        //8. GROUPING ELEMENT...
         
        List<String> words = Arrays.asList("Hello","World","Java","Stream","Collecting");

        System.out.println(words.stream().collect(Collectors.groupingBy(x-> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(" , "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.counting())));


        TreeMap<Integer,Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length , TreeMap::new , Collectors.counting()));
        System.out.println(treeMap);


        //9. PARTITIONING ELEMENT'S ...[partitions elements into to groups(true & false) based on a pridicate] !!

        System.out.println(words.stream().collect(Collectors.partitioningBy(x-> x.length() > 5)));


        //10. MAPPING AND COLLCETING... [Applies a mapping function before collecting.] !!

        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));





        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  EXAMPLE'S  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Example's of Stream and Collectors...");

        System.out.println();
        //1. Collecting name by length...

        List<String> l1 = Arrays.asList("Anna","BOb","Alexander","Brian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
        
        //2. Counting word's occurrences...

        String sentence = "hello world hello java world";

        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

        //3. Partitioning Even and odd numbers...
        
        List<Integer> evenOdd = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(evenOdd.stream().collect(Collectors.partitioningBy(x-> x % 2== 0)));
        

        //4.Summing value in map...
        Map<String,Integer> items =  new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));

        //5. Creating a map from a Stream elements...
        List<String> fruits = Arrays.asList("Apple","Banan","Orange");
        System.out.println(fruits.stream().collect(Collectors.toMap(x->x.toUpperCase(), x->x.length())));


        //6. Check occurrences  of word ...

        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
         System.out.println(words2.stream().collect(Collectors.groupingBy(x->x ,Collectors.counting())));
         //using map...
         System.out.println(words2.stream().collect(Collectors.toMap(k->k , v->1 , (x,y) -> x+y)));




         //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  Primitive Stream >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

         int[] numbers3 = {1,2,3,4,5,6,7};
         IntStream stream = Arrays.stream(numbers3);

         System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
         System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));

         IntStream.of(1,2,3);

         DoubleStream  doubles = new Random().doubles(5);
         System.out.println(doubles.sum());
        // System.out.println(doubles.boxed().toList());

         IntStream ints = new Random().ints(5);
         System.out.println(ints.boxed().toList());

         
 
    }
}
f