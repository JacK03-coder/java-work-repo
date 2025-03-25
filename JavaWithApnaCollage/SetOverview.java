
import com.sun.source.tree.Tree;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(45);
        set.add(65);
        set.add(39);
        System.out.println(set);
        set.remove(45);
        System.out.println(set.contains(67));
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}
