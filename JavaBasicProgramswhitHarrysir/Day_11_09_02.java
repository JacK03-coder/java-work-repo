/*So in Dynamic methos Dispatch wew simply override  an method .. bur when we crate object of the method we do a thing(trick)..
 the formate of crating object is [class  refereance = new keyword constrcutor/method]..
 so in this code we user the place of class the class and int the place of method we use method of child class insted of parent class... 
 usually we use same class and the  method of same class but in this we use different clss and diffrent method/constructor...
 And the point is method is run so that answer is it's run the method of object; like on the given example smartphone  method is run...
 */

class phone{
    public void phone(){
        System.out.println("phone first.. ");
    }

    public void phone2(){
        System.out.println("phone second..");
    }
    public void samephone(){
        System.out.println("same phone of phone");
    }
}

class smartphone extends phone{
        public void phone3(){
            System.out.println("smartphone first..");
        }
        public void phone4(){
            System.out.println("smartphone second..");
        }
        public void samephone(){
            System.out.println("same phone of smart phone");
        }
}


public class Day_11_09_02 {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.samephone();
    
    }
}
