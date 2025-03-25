
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.7f,true);
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Guava", 30);
        linkedHashMap.put("Orange", 40);
        linkedHashMap.put("Charry", 50);
        linkedHashMap.put("Strwbarry", 60);

        linkedHashMap.get("apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    
    }
}
