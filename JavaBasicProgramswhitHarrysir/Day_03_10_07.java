
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.lang.model.element.Element;

public class Day_03_10_07 {
    public static void main(String[] args) {
        //creating an array List and storing data of 10 student's...
        ArrayList<String> al = new ArrayList<>();

        al.add("studnet 1");
        al.add("student 2");
        al.add("studnet 3");
        al.add("student 4");
        al.add("studnet 5");
        al.add("student 6");
        al.add("studnet 7");
        al.add("student 8");
        al.add("studnet 9");
        al.add("student 10");

        for(Object o: al){
            System.out.println(o);
        }


        //date time formate creat's by the user...

        LocalDateTime ldt1 = LocalDateTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("h:m:s");
        String Mytime= ldt1.format(dtf1);
        System.out.println(Mytime);

        
    } 
}
