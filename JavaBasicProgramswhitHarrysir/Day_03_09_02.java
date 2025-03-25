class employee{
        int id;
        String name;
        public void showdeatils(){
            System.out.println("Employee name is :"+name+ "Employee ID is : "+id);
        }
  public class Day_03_09_02 {
  public static void main(String[] args) {
    System.out.println("Printing deatile's with the help of custom class...");
        employee jay = new employee();
        jay.id = 3;
        jay.name = "Jay";
        jay.showdeatils();
      
      }
    }
 }