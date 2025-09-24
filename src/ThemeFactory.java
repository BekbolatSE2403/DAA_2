// Abstract Factory interface
interface ThemeFactory {
    String createButton();
    String createPanel();
}

// Concrete Factory for Light Theme
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

// Concrete Factory for Dark Theme
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