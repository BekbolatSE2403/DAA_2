// Concrete implementation of Transport for ship delivery
public class Ship implements Transport {
    private static final double Cost_per_km = 0.5; // Cost per kilometer for ship delivery

    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * Cost_per_km; // Calculate total cost based on distance
    }
}