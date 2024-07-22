package AbstractFactory;

// MacTextbox.java
public class MacTextbox implements Textbox {
    @Override
    public void typeText(String text) {
        System.out.println("Text '" + text + "' typed in Mac Textbox");
    }
}
