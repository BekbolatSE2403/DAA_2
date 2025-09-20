// Main application class that integrates both Factory Method and Abstract Factory patterns


public class LogisticsApp {
    private Logistics logistics;        // Factory Method component for transport
    private GUIFactory guiFactory;      // Abstract Factory component for GUI

    // Constructor dependency injection
    public LogisticsApp(Logistics logistics, GUIFactory guiFactory) {
        this.logistics = logistics;
        this.guiFactory = guiFactory;
    }

    // Main method that demonstrates both patterns working together
    public void run(double distance) {
        System.out.println("--- Logistics Operation ---");
        logistics.planDelivery(distance); // Uses Factory Method pattern

        System.out.println("--- GUI Rendering ---");
        guiFactory.createButton().render(); // Uses Abstract Factory pattern
        guiFactory.createPanel().render();  // Uses Abstract Factory pattern
    }
}