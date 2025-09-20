// Abstract creator class implementing the Factory Method pattern

abstract class Logistics {
    // Template method that defines the delivery planning process

    public void planDelivery(double distance) {
        Transport transport = createTransport();        // Factory method call
        transport.deliver();
        double cost = transport.calculateCost(distance);
        System.out.println("Cost for " + distance + " km: $" + cost);
    }

    // Factory method to be implemented by concrete subclasses
    abstract Transport createTransport();
}