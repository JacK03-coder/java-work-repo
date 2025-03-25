
public class Day_05_09 {
     static class Employee{
        int id;
        String name;
        public void printdetails(){
            System.out.println("Employee id is : "+id);
            System.out.println("Employee name is : "+name);
        }
    }
    public static void main(String[] args) {
        Employee jack = new Employee();
        jack.id = 3;
        jack.name = "Unknown Employee";
        Employee jay = new Employee();
        jay.id = 4;
        jay.name = "random guy";
        jack.printdetails();
        jay.printdetails();
        // System.out.println(jack.id);
        // System.out.println(jack.name);
    }
}