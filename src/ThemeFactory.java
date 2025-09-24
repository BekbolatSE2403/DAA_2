// Abstract Factory
interface ThemeFactory {
    String createButton();
    String createPanel();
}

// Concrete Factories
class LightThemeFactory implements ThemeFactory {
    @Override
    public String createButton() {
        return "Light Button";
    }

    @Override
    public String createPanel() {
        return "Light Panel";
    }
}

class DarkThemeFactory implements ThemeFactory {
    @Override
    public String createButton() {
        return "Dark Button";
    }

    @Override
    public String createPanel() {
        return "Dark Panel";
    }
}