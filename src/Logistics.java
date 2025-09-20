abstract class Logistics {
    public void planDelivery(double distance) {
        Transport transport = createTransport();
        transport.deliver();
        double cost = transport.calculateCost(distance);
        System.out.println("Cost for" + distance + " per km: $" + cost);
    }

    abstract Transport createTransport();
}
