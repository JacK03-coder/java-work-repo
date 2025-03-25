public class Day_05_09_02 {
   static class Employee{
      private   int id;
      private  String name;

      public void setName(String n){
        name = n;
      }
      public String getName(){
        return name;
      }

      public void setId(int i){
        id = i ;
     }
     public int getId(){
        return id;
      }

    }
    public static void main(String[] args) {
        Employee jack = new Employee();
        // jack.id= 3;
        // jack.name = "JacK";
        jack.setName("JacK");
        System.out.println(jack.getName());
        jack.setId(2);
        System.out.println(jack.getId());

        Employee thor = new Employee();
        thor.setName("Thor");
        thor.setId(5);
        System.out.println(thor.getName());
        System.out.println(thor.getId());

        Employee tony = new Employee();
        tony.setId(6);
        tony.setName("Tony");
        System.out.println(tony.getId());
        System.out.println(tony.getName());

        Employee loki = new Employee();
        loki.setId(9);
        loki.setName("Loki");
        System.out.println(loki.getId());
        System.out.println(loki.getName());
    }
}
