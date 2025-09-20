// Interface defining the contract for all transport types

public interface Transport {
    void deliver();   // Method to perform delivery
    double calculateCost(double distance);    // Method to calculate delivery cost
}
