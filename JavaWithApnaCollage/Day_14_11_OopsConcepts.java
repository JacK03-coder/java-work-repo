
import javax.print.attribute.Size2DSyntax;

public class Day_14_11_OopsConcepts {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setcolor("Black");
        // p1.setTip(5);
        // System.out.println(p1.getcolor());
        // System.out.println(p1.gettip());

        // // Student s1 = new Student();
        // // s1.calcPercentage(45, 54, 64);
        // // System.out.println(s1.percentage);

        // BankAccount myacc = new BankAccount();
        // myacc.name = "jack";
        // myacc.setpassword("hi");
        // System.out.println(myacc.name);

        // Student s1 = new Student();
        // s1.name = "jack";
        // s1.roll = 123;
        // s1.marks[0] = 89;
        // s1.marks[1] = 86;
        // s1.marks[2] = 98;

        // Student s2 = new Student(s1);
        // s2.password = "abcd";
        // s1.marks[2] = 100;

        // for(int i=0 ; i<3 ; i++){
        //     System.out.println(s2.marks[i]);
        // }

        // // fish shark = new fish();
        // // shark.eat();

        // Shark shark1 = new Shark();

        // shark1.color = "red  logged with blood";
        // shark1.eat();
        // System.out.println(shark1.color);
        
        // Calculator cal = new Calculator();
        
        // System.out.println(cal.sum(4, 5));
        // System.out.println(cal.sum(3, 4, 6));

        // deer d = new deer();
        // d.eat();

        // Animal33 a44 = new Animal33();
        // a44.eat();

        Hourse myhourse  = new Hourse();
        myhourse.walk();
        

        King k = new King();
        k.moves();

        Nothing no = new Nothing();
        no.moves();
        no.redomthings();
    }
}

// Abstraction in java....classes-->>>

abstract class Animal {
    
    String color;

    Animal(){
        color = "Dark Black";
    }
    void eat(){
        System.out.println("Animal Eat's");
    }

    abstract void walk(); 
}

class Hourse extends Animal{

    void walk(){
        System.out.println("Hourse walks on 4 legs");
    }

    void changeColor(){
        color = "White";
        }
}

class Chicken extends  Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
    void changeColor(){
        color = "Yellow";
    }
} 


//Interface in java...

interface BLackPlayer{
    void redomthings();
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all 4 direction) ");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up , down , left , right , diagonal(all 4 dirction 1 step)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right");

    }
}

class Nothing implements  ChessPlayer , BLackPlayer{
    public void moves(){
        System.out.println("he do nothing");
    }
    public void redomthings(){
        System.out.println("Do rendom things");
    }
}

// Inheritance :: when a child class extand's perent class called Inheritance...
// class animal{
//     String color;

//     void eat(){
//         System.out.println("Eat");
//     }

//     void breathe(){
//         System.out.println("Breathe");
//     }
// }

// class fish extends animal {
//     int fins;

//     void swim(){
//         System.out.println("Swim");
//     }
// }

// class Student {
//     String name;
//     int roll ;
//     String password;
//     int marks[];
    

    // # Shallow copy.....

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }


    // # Deep copy....
    
//     Student(Student s1){
//         marks = new int[3];
//         this.name = name;
//         this.roll = roll;

//         for(int i=0 ; i<marks.length ; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }
//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called...");
//     }
    
//  }


//   Getter and Setter.....
//  class Pen {
//    private  String color;
//    private  int tip;

//    int gettip(){
//     return this.tip;
//    }

//    String getcolor(){
//     return this.color;
//    }
//     void setcolor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int newTip){
//         this.tip = newTip;
//     }
//  }

//  class Student{
//     String  name; 
//     int     age;
//     float   percentage;

//     void calcPercentage(int chem , int phy , int math){
//         percentage = (chem+phy+math)/3.0f;
//     }
    
//  }


// Random Stuff....
//  class BankAccount {
//     public String name; 
//     private String password;

//     void setpassword(String psw){
//         password = psw;
//     }
//  }

//  Hybrid Inheritance .....

// class Animal {
//     String color ; 

//     void breathe(){
//         System.out.println("Breathe");
//     }

//     void eat(){
//         System.out.println("Eat");
//     }
// }
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims");
//     }
// }

// class Bird extends Animal {
//     int wings;
//     void fly(){
//         System.out.println("fly");
//     }
// }

// class Mammal extends Animal {
//     int legs;
//     void walk(){
//         System.out.println("Walks..");
//     }
// }

// class Tuna extends Fish{

//     void special(){
//         System.out.println("I don't have anything to write so jhfdgh");
//     }
// }

// class Shark extends Fish{

//     void special(){
//         System.out.println("Nothing to write...");
//     }
// }

// class Peacock extends Bird{

//     void special(){
//         System.out.println("nothing to say");
//     }
// }

// class Dog extends Mammal{
//     void special(){
//         System.out.println("nothings to write");
//     }
// }

// class Cat extends Mammal{
//     void special(){
//         System.out.println("nothing to write");
//     }
// }

// class Human extends Mammal{
//     void special(){
//         System.out.println("Most chutiya species");
//     }
// }


// class Calculator {
    
//     int sum(int a , int b){
//         return a+b;
//     }

//     int sum(int a , int b , int c){
//         return a+b+c;
//     }

//     float sum(float a , float b){
//         return a+b;
//     }
// }

// class Animal33 {
//     void eat(){
//         System.out.println("Anything");
//     }
// }

// class deer extends Animal33{
//     void eat(){
//         System.out.println("Grass");
//     }
// }