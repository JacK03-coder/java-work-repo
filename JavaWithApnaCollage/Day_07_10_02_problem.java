import java.util.Scanner;
public class Day_07_10_02_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String name = scan.next();
        for(int i =0 ; i<name.length()-1;i++){
            for(int j = name.length()-1; j>0 ; j--){
                System.out.print(name.charAt(i)+""+name.charAt(j)+"");
            }
        }
    }
}
/*
 * CLASS HOME WORK QUEATION NOT REALLY LIKE I WNNT TO DO THIS ... IT KIND OF  I JUST HAVE TO DO THAT..
 */