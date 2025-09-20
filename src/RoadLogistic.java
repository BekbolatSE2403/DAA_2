public class RoadLogistic extends Logistic{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
