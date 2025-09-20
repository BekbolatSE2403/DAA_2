public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Panel createPanel() {
        return new DarkPanel();
    }
}
