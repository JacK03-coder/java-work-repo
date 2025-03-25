public class Day_09_09_02 {
       class Base{
        int x;
        public void setx(int x){
            this.x =x;
        }
        public int getx(){
            return x;
        }

           class Derived extends Base{
            int y;
            public void sety(int y){
                this.y =y ;
            }
            public int gety(){
                return y;
            }
        }

    }
    public static void main(String[] args) {


        //!!! Using staic in class....(Static nested class)!!!

        
        //  Base b = new Base();
        //  b.setx(45);
        //  System.out.println(b.getx());
        //  Base.Derived k = new Base.Derived();
        //  k.sety(65);
        //  System.out.println(k.gety());
        
        //  Base.Derived m = new Base.Derived();
        //  m.sety(678);
        //  System.out.println(m.gety());

        //  Base.Derived g = new Base.Derived();
        //  g.setx(54);
        //  System.out.println(g.getx());

        //  It Genrate an error because you can access Derived class propertiy from the Base class...becuase Dervied Extends Base Not Base Extends Dervied....
        // Base j  = new Base();
        // j.sety(576);
        // System.out.println(j.gety());


        // !!!Without using Static in class......(Non static-inner class)!!!

        Day_09_09_02 outer = new  Day_09_09_02();
        Base h = outer.new Base();
        h.setx(56);
        System.out.println(h.getx());

        Base.Derived j = h.new Derived();
        j.sety(67);
        System.out.println(j.gety());
    }
}
