package AbstractFactory;


public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Textbox createTextbox() {
        return new WindowsTextbox();
    }
}