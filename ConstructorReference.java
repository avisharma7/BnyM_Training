// Definition of the functional interface
interface Messageable {
    Message getMessage(String msg);
}

// Definition of the Message class with a constructor that takes a String
class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}

// Main class to demonstrate constructor reference
public class ConstructorReference {
    public static void main(String[] args) {
        // Creating a constructor reference
        Messageable hello = Message::new;

        // Using the constructor reference to create a new Message object
        hello.getMessage("Hello");
    }
}
