
class Box<T extends Number>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
 
class Pair<K,V>{
    private K key;
    private V value;
    
    public Pair(K key , V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }

   public V getValue(){
        return value;
   }
}
public class Day_31_12_Generics {
    public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Belong's Box class...
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println(i);

        // Belong's to Pair class...

        Pair<Integer,String> pair = new Pair<>(3, "jay");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        // Use's of Generic Method...
        Integer[] intArray ={1,2,3,4,5,6};
        String[]  strArray = {"hello" , "world" ,"jack"};
        printArray(intArray);
        printArray(strArray);
    }
}