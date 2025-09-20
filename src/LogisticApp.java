public class LogisticApp {
    private Logistic logistic;
    private GUIFactory guiFactory;

    public LogisticsApp(Logistics logistics, GUIFactory guiFactory) {
        this.logistics = logistics;
        this.guiFactory = guiFactory;
    }

    public void run(double distance) {
        System.out.println("--- Logistics Operation ---");
        logistics.planDelivery(distance);

        System.out.println("--- GUI Rendering ---");
        guiFactory.createButton().render();
        guiFactory.createPanel().render();
    }
}
