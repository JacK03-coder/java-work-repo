
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.jar.Attributes;
import javax.sound.sampled.SourceDataLine;


class Person{
    private String name;
    private int id;

    public Person(String name , int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        // int hash = 3;
        // hash = 61 * hash + Objects.hashCode(this.name);
        // hash = 61 * hash + this.id;
        // return hash;
        return Objects.hash(name,id);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + "]";
    }
}

public class HashMapDemo {
    public static int simpleHash(String key){
        int sum =0;
        for(char c : key.toCharArray()){
            sum += c;
        }
        return sum;
    }
    public static void main(String[] args) {

        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("BOb", 2);
        Person p3 = new Person("Alice", 1);
        Person p4 = new Person("jACK", 3);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");
        map.put(p4,"CEO");

        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));
        System.out.println(p1);


        // System.out.println(simpleHash("jony"));
        // System.out.println(simpleHash("jay"));
        // System.out.println(simpleHash("ojny"));
    //     HashMap<Integer , String> map = new HashMap<>();
    //     map.put(1, "Thor");
    //     map.put(2, "Loki");
    //     map.put(3, "Hulk");
    //     map.put(4, "Captain America");
    //     map.put(5, "Iron Man");
    //     System.out.println(map);

    //     System.out.println(map.get(4));

    //     System.out.println(map.containsKey(3));
    //     System.out.println(map.containsValue("Thor"));

    //    Set<Integer> keys = map.keySet();
    //    for(Integer key: keys){
    //     System.out.println(map.get(key));
    //    }

    //    for(Integer key : map.keySet()){
    //     System.out.println(map.get(key));
    //    }

    //    Set<Map.Entry<Integer,String>> enteries = map.entrySet();
    //    for(Map.Entry<Integer, String> entry : enteries){
    //     System.out.println(entry.getKey() +" "+ entry.getValue());
    //    }
    }
}
