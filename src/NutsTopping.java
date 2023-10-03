class NutsTopping implements Topping {
    @Override
    public double getToppingCost() {
        return 3.5;
    }

    @Override
    public String getTopping() {
        return "Nuts";
    }
}