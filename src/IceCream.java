import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private final Taste taste;
    private final List<Topping> toppings;
    private PricingStrategy pricingStrategy;

    public IceCream(Taste taste, PricingStrategy pricingStrategy) {
        this.taste = taste;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getToppingsPrice() {
        double totalToppingCost = 0d;
        for (Topping topping: this.toppings) {
            totalToppingCost += topping.getToppingCost();
        }
        return totalToppingCost;
    }
    public double getPrice() {
        double toppingsPrice = getToppingsPrice();
        double baseTasteCost = this.taste.getBaseCost();

        return this.pricingStrategy.calculatePrice(baseTasteCost) + toppingsPrice;
    }

    public String getTaste() {
        return this.taste.getTaste();
    }

    public String getToppings() {
        String out = "";
        for (Topping topping: toppings) {
            out += topping.getTopping() + " ";
        }
        return out;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "taste=" + taste +
                ", toppings=" + toppings +
                '}';
    }
}
