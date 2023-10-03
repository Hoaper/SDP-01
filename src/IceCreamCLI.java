public class IceCreamCLI {
    public static void main(String[] args) {
        Taste chocolateTaste = new ChocolateTaste(1.5);
        Taste vanillaTaste = new VanillaTaste(1.0);
        Topping sprinklesTopping = new SprinklesTopping();
        Topping nutsTopping = new NutsTopping();

        IceCream iceCreamWithChocolateAndNuts = new IceCream(chocolateTaste);
        iceCreamWithChocolateAndNuts.addTopping(nutsTopping);


        IceCream iceCreamWithVanillaAndSprinkles = new IceCream(vanillaTaste);
        iceCreamWithVanillaAndSprinkles.addTopping(sprinklesTopping);


        IceCreamShop shop = IceCreamShop.getInstance();
        shop.addIceCream(iceCreamWithChocolateAndNuts);
        shop.addIceCream(iceCreamWithVanillaAndSprinkles);

        shop.printAllIceCreams();
    }
}
