public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Demo ===");

        Logistics road = new RoadLogistics();
        Logistics sea = new SeaLogistics();

        road.planDelivery(100);
        sea.planDelivery(500);

        System.out.println("\n=== Abstract Factory Demo ===");

        ThemeFactory light = new LightThemeFactory();
        ThemeFactory dark = new DarkThemeFactory();

        System.out.println("Light Theme: " + light.createButton() + " + " + light.createPanel());
        System.out.println("Dark Theme: " + dark.createButton() + " + " + dark.createPanel());

        System.out.println("\n=== Combined Demo ===");
        demonstrateCombined(road, light);
        demonstrateCombined(sea, dark);
    }

    static void demonstrateCombined(Logistics logistics, ThemeFactory theme) {
        System.out.println("--- Combined Operation ---");
        logistics.planDelivery(200);
        System.out.println("UI: " + theme.createButton() + " + " + theme.createPanel());
    }
}