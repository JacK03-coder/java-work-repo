
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List: "+shoppingList);

        for(String item: shoppingList){
            System.out.println(item);

            if(item.equals("Egg")){
                shoppingList.add("Butter");
                System.out.println("Added Buttter While Reading...");
            }
        }

        System.out.println("Shopping List: "+ shoppingList);
    }
}
