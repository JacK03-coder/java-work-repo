package mythread.secondthreadmethod;

public class Test2 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello");
        
        Thread t1 = new Thread(runnable);
       // t1.start();

    //    EngineeringStudent engineeringStudent = new EngineeringStudent();
    //    String std1 = engineeringStudent.getBio("Tony");
    //    System.out.println(std1);

    Student engineeringStudent = new Student() {
        @Override 
        public String getBio(String name){
            return name +" is Engineering student";
        }
    };

    String bio = engineeringStudent.getBio("Tony");
    System.out.println(bio);

    Student lowStudent = name->{return name+" is low Student..!!";};

    String lowstd = lowStudent.getBio("Thor");
    System.out.println(lowstd);

    }
}
