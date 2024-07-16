package AbstractFactory;

// Client.java
public class Client {
    public static void main(String[] args) {
        UIFactory factory;

        // Using Windows Factory
        factory = new WindowsFactory();
        Button windowsButton = factory.createButton();
        Textbox windowsTextbox = factory.createTextbox();

        windowsButton.click();
        windowsTextbox.typeText("Hello Windows");

        // Using Mac Factory
        factory = new MacFactory();
        Button macButton = factory.createButton();
        Textbox macTextbox = factory.createTextbox();

        macButton.click();
        macTextbox.typeText("Hello Mac");
    }
}
