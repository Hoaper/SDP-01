public class VanillaTaste implements Taste {
    @Override
    public String getTaste() {
        return "Vanilla";
    }

    private final double baseCost;
    @Override
    public double getBaseCost() {
        return this.baseCost;
    }

    public VanillaTaste(double baseCost) {
        this.baseCost = baseCost;
    }
}
