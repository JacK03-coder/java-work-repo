
import java.lang.ref.WeakReference;

class Phone{
    String brand;
    String model;
    
    public Phone(String brand , String model) {
        this.brand = brand;
        this.model = model;
    }
     // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("GC{");
    //     sb.append("brand=").append(brand);
    //     sb.append(", model=").append(model);
    //     sb.append('}');
    //     return sb.toString();
    // }
    @Override
    public String toString(){
        return "Brand: "+brand+", Model: "+model+"";
    }
}

public class GC {

    public static void Sleepforsec(){
        try {
                Thread.sleep(10000);
        } catch (Exception ignored) {
        }
    }

    public static void main(String[] args) {
       WeakReference<Phone> phone = new WeakReference<>(new Phone( "Apple", "16 Pro Max"));
       System.out.println(phone.get());
       System.gc();
       Sleepforsec();
       System.out.println(phone.get());
    }
}