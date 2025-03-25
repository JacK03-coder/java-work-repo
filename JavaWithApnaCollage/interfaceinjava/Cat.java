package interfaceinjava;
import interfaceinjava.*;
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eat...");
        
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep...");
        
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();
        cat.eat();
    }

}
