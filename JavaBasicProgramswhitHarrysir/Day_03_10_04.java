
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TimeZone;
import java.util.spi.CalendarNameProvider;

public class Day_03_10_04 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        //divide by 1000 to get second's , divide by 3600 to get minit's , divide by 24 to get hour's , at last divide by 365 to get year.....

        //The Date class in java...
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());

        //Calendar Class in java...

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR) + ":"+c.get(Calendar.MINUTE) +":"+c.get(Calendar.SECOND));

        //Gregorian Calendar --->>>>

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[5]);


        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);
        LocalTime ltime = LocalTime.now();
        System.out.println(ltime);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
