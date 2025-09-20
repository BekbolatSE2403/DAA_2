// Demo class with main method
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Demo ===");

        // Demonstrate Factory Method
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        roadLogistics.planDelivery(100);
        System.out.println();
        seaLogistics.planDelivery(500);

        System.out.println("\n=== Abstract Factory Demo ===");

        // Demonstrate Abstract Factory
        GUIFactory lightFactory = new LightThemeFactory();
        GUIFactory darkFactory = new DarkThemeFactory();

        LogisticsApp app1 = new LogisticsApp(new RoadLogistics(), lightFactory);
        LogisticsApp app2 = new LogisticsApp(new SeaLogistics(), darkFactory);

        System.out.println("Road Logistics with Light Theme:");
        app1.run(150);

        System.out.println("\nSea Logistics with Dark Theme:");
        app2.run(300);
    }
}