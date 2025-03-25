/*this all about interface and i really don't get anything...*/
interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MysampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class Day_14_09 {
    public static void main(String[] args) {
        MysampleClass mc = new MysampleClass();
        mc.meth1();
        mc.meth2();
        mc.meth3();
        mc.meth4();

    } 
}
