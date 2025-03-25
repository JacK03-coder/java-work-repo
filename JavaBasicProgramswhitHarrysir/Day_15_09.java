interface MyInterface{
    void meth1();
    void meth2();
}

interface MyInterface2 extends MyInterface {
    void meth3();
    void meth4();
}

class mySampleClass implements MyInterface2{
   public void meth1(){
    System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }
}

public class Day_15_09 {
    public static void main(String[] args) {
        
        
    }
}
