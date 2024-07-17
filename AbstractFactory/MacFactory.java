package AbstractFactory;

// MacFactory.java
public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Textbox createTextbox() {
        return new MacTextbox();
    }
}