import java.util.ArrayList;
import java.util.List;

public class ComarableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("BOb", 3.7));
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Jony", 3.9));
        list.sort(null);
        System.out.println(list);
        for(Student std : list){
            System.out.println(std);
        }

    }  
}

class Student  implements Comparable<Student>{
    String name;
    double cgpa;
        Student(String name ,double cgpa){
            this.name = name;
            this.cgpa = cgpa;
        }
        @Override
        public String toString() {
            return "name: "+name+", cgpa: "+cgpa;
        }
        @Override
        public int compareTo(Student o) {
            return Double.compare(o.getCgpa(), this.getCgpa());
    }
        public String getName() {
            return name;
        }
        public double getCgpa() {
            return cgpa;
        }
}