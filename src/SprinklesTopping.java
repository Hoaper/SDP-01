class SprinklesTopping implements Topping {
    @Override
    public String getTopping() {
        return "Sprinkles";
    }

    @Override
    public double getToppingCost() {
        return 1.5;
    }
}