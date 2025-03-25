

     class mythread6 extends Thread{
        public void run(){
            int i = 3;
            while(i<30){
                System.out.println("nothing");
                i++;
            }
        }
    }

     class mythread8 extends Thread{
        public void run(){
            int j =3;
            while(j<45){
                System.out.println("something");
                j++;
            }
        }
    }
    public class Day_27_09 {
    public static void main(String[] args) {
        mythread6 mt = new mythread6();
        mythread8 mt4 = new mythread8();
        mt.start();
        mt4.start();
    }
}