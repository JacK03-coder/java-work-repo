import java.util.LinkedHashMap;

public class StudentData2<K,V> extends LinkedHashMap<K,V>{
    private int capacity;
    public StudentData2(int capacity) {
        super(capacity,0.7f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // TODO Auto-generated method stub
        return size()>capacity;
    }

    public static void main(String[] args) {

        StudentData2<String,Integer> studentData2 = new StudentData2<>(3);

        studentData2.put("Tony", 99);
        studentData2.put("Bruce", 95);
        studentData2.put("Thor", 50);
        studentData2.get("Tony");
        studentData2.put("Steve", 89);

        System.out.println(studentData2);
    } 
}
