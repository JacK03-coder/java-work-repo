
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildcardGenerics {

    public static double  sum(List<? extends Number> numbers){
        double sum = 0;
        for(Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(2.3,4.7,3)));
        List<? super  Number> numbers = Arrays.asList(1,2,3);
        numbers.add(23);
        numbers.add(3.4);
        
    }
}
