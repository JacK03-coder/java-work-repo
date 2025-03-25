
import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDEY, "Gym");
        map.put(Day.TUESDAY, "Walk");
        map.put(Day.FRIDAY, "Tour");
        System.out.println(map);        
        System.out.println(map.get(Day.MONDEY));
    }
}
enum Day{
    MONDEY, TUESDAY,WEDNESDAY, THURSDAY ,FRIDAY
}