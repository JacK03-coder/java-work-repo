
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day_03_10_06 {
    public static void main(String[] args) {
        //creat's an date time object...
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //Make the formate by the user  whatever we want using datetimeformatter ....     
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd");
                //create an string to print the formate of the date which we create...
                String myDate = ldt.format(dtf);
                System.out.println(myDate);
        //Predefined formate's ..
        DateTimeFormatter pdtf = DateTimeFormatter.ISO_LOCAL_TIME;
                String myDate1 = ldt.format(pdtf);
                System.out.println(myDate1);
    }
}
