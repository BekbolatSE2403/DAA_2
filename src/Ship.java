public class Ship implements Transport {
    private static final double Cost_per_km  = 0.5;

    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * Cost_per_km;
    }
}
