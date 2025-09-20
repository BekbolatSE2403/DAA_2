public class Truck implements Transport {
    private static final double Cost_per_km  = 1.5;

    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }

    @Override
    public void calculateCost(double distance) {
        return distance * Cost_per_km;
    }
}
