public class Day_09_09 {

   static  class Base{
        int x ;

        public int get(){
            return x;
        }

        public void setX(int x){
            this.x =x ;
        }

         class Derived extends Base{
             int y;

             public int gety(){
                return y;
             }
            
            public void sety(int y){
                this.y  = y;
            }
        }
    }
    
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(23);
        System.out.println(b.get());
        Base base = new Base();
        Base.Derived k = base.new Derived();
        k.setX(67);
        System.out.println(k.get());
    }
}   