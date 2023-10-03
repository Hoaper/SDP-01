import java.util.ArrayList;
import java.util.List;

// Singleton realization
public class IceCreamShop {

    private static IceCreamShop instance; // Required instance
    private final List<IceCream> iceCreamList;

    // Private constructor to prevent instantiation
    private IceCreamShop() {
        iceCreamList = new ArrayList<>();
        System.out.println("IceCreamShop instance created.");
    }

    public static IceCreamShop getInstance() {
        // Lazy initialization: create the instance only if it hasn't been created yet
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void addIceCream(IceCream iceCream) {
        iceCreamList.add(iceCream);
    }

    public void removeIceCream(IceCream iceCream) {
        iceCreamList.remove(iceCream);
    }

    public void printAllIceCreams() {
        String out = "";
        for (IceCream iceCream: iceCreamList) {
            out += iceCream;
        }
        System.out.println(out);
    }

}