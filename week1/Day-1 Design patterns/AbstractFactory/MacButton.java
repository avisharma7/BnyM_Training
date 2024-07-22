package AbstractFactory;

// MacButton.java
public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac Button clicked");
    }
}