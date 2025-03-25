package interfaceinjava;
import interfaceinjava.*;
public class Dog implements Animal{
    
    @Override
    public void eat() {
        System.out.println("Dog Eat...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleep...");
        
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
    }
}
