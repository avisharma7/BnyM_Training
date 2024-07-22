
import java.util.Optional;
public class OptionalEx {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = null; //setting value for 5th index
        Optional<String> checkfornull = Optional.ofNullable(str[5]);
        if (checkfornull.isPresent()) {
            String lowercasestring = str[5].toLowerCase();
            System.out.println(lowercasestring);
        } else {
            System.out.println("The string is not present: ");
        }
    }

}
