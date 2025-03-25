
/* SO in that Scenario we are creating multiple constrcutor within Base & Derived class 
 * And check how they work's if in main after creating the Object  of Derived class if we call the object..
 * without any argument it go the constrctor with no argument...
 * And if we call the object with argument it go (execute) the constrcutor with argument's....
  */

class Base1{

    //Creating 2 Construtor in Base class one with  Argument & another without Argument...
    Base1(){
        System.out.println("this is the constructor of Base class...");
    }

    Base1(int x){
        System.out.println("new consteuctor with value : "+x);
    }

    //Get() & set() Method's for Base class...
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived1 extends Base1{

    //Creating 2 Construtor in Derived class one with  Argument & another without Argument...
    Derived1(){
        System.out.println("This is the constructor of Dervied class.....");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("new Dervied constructor with value: "+y);
    }
    
    //Get() & Set() Method's for Derived class....
    public int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
    class ChildOfDerived extends Derived1{

         ChildOfDerived(){
            System.out.println("This is constructor of childofDerived class..");
        }
         ChildOfDerived(int x, int y , int z){
            super(x,y);
            System.out.println("new derived constructor value: "+z);
        }
        
}


public class Day_10_09 {
    public static void main(String[] args) {
         Base1 b = new Base1();
         Derived1 d = new Derived1(23,4);
        ChildOfDerived cd = new ChildOfDerived(2,6,5);

    }
}
