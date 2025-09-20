// Concrete implementation of Transport for truck delivery
public class Truck implements Transport {
    private static final double COST_PER_KM = 1.5; // Cost per kilometer for truck delivery

    @Override
    public void deliver() {
        System.out.println("Delivering by Truck");
    }

    @Override
    public double calculateCost(double distance) {
        return distance * COST_PER_KM; // Calculate total cost based on distance
    }
}