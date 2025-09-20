public class SeaLogistic extends Logistic{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
