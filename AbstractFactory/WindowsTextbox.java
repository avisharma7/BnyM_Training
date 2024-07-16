package AbstractFactory;

// WindowsTextbox.java
public class WindowsTextbox implements Textbox {
    @Override
    public void typeText(String text) {
        System.out.println("Text '" + text + "' typed in Windows Textbox");
    }
}