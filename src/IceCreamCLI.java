public class IceCreamCLI {
    public static void main(String[] args) {
        // Tastes
        Taste chocolateTaste = new ChocolateTaste(1.5);
        Taste vanillaTaste = new VanillaTaste(1.0);
        // Toppings
        Topping sprinklesTopping = new SprinklesTopping();
        Topping nutsTopping = new NutsTopping();
        // Strategies
        PricingStrategy premiumPricingStrategy = new PremiumPricingStrategy();
        PricingStrategy regularPricingStrategy = new RegularPricingStrategy();

        // Creating IceCream
        IceCream iceCreamWithChocolateAndNutsPremium = new IceCream(chocolateTaste, premiumPricingStrategy);
        iceCreamWithChocolateAndNutsPremium.addTopping(nutsTopping);

        // Creating IceCream
        IceCream iceCreamWithVanillaAndSprinkles = new IceCream(vanillaTaste, regularPricingStrategy);
        iceCreamWithVanillaAndSprinkles.addTopping(sprinklesTopping);

        // Get Price
        System.out.println(iceCreamWithVanillaAndSprinkles.getPrice());

        // Creating shop
        IceCreamShop shop = IceCreamShop.getInstance();
        shop.addIceCream(iceCreamWithChocolateAndNutsPremium);
        shop.addIceCream(iceCreamWithVanillaAndSprinkles);

        // Printing all icecreams
        shop.printAllIceCreams();
    }
}
