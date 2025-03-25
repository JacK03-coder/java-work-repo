/*
 * Working with constructor's.... And method overridding in this code we simply create's two method's in both  class...
 * which can print a rendom sum it used in both class the method's are totally same...
 * so java allow this to use same method's in differnet class....
 * but if we calleing the method from the main we have to specify which method we are acutally calling that time....so simple
 */

class Base {
     Base(){
      System.out.println(" constructor of class B");
     }
     Base(int x){
        System.out.println("The value of x is : "+x);
     }
        public  static int sum(int n){
         int num = n*5;
         return num;
      }

     public int x;

     public int getx(){
        return x;
     }
     public void setx(int x){
        this.x =x ;
     }

}

class Derived extends Base{
      Derived(){
         System.out.println("constructor of Derived..");
      }
      Derived(int x ,int y){
         super(x);
         System.out.println("The value of Y is: "+y);

      }
       public static int sum(int n){
         int num = n*6;
         return num;
      }
       public int y;
      public int gety(){
         return y;
      }
      public void sety(int y){
         this.y =y ;
      }
}
public class Day_11_09 {
    public static void main(String[] args) {
          Base b =new Base();
        b.setx(78);
        System.out.println(" value : "+b.getx());
          Base k = new Base(98);
        k.setx(43);
        System.out.println(" value : "+k.getx());
        Base f = new Base();
        f.setx(8);
        System.out.println(" "+f.getx());

        Derived d = new Derived();
        d.sety(65);
        System.out.println(d.gety());
         
       System.out.println(" sum : "+ Derived.sum(6));   
    }
}
