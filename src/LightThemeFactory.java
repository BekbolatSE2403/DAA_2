public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Panel createPanel() {
        return new LightPanel();
    }
}
