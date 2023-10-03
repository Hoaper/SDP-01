class ChocolateTaste implements Taste {
    @Override
    public String getTaste() {
        return "Chocolate";
    }
    private final double baseCost;

    @Override
    public double getBaseCost() {
        return this.baseCost;
    }

    public ChocolateTaste(double baseCost) {
        this.baseCost = baseCost;
    }
}


