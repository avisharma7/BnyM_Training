
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,8,4);

        //using stream API to filter, collect, print and convert

        //1 filter the list to include only even numbers and print it
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).toList();
        System.out.println("Even Numbers: "+ evenNumbers);

        //2 convert list to another data structure
        //converting the list of even numbers to set
        Set<Integer> evenNumberSet = evenNumbers.stream().collect(Collectors.toSet());
        System.out.println("Even Number Set: " + evenNumberSet);

        // Use stream to print directly
        System.out.println("Even Numbers (printed directly):");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n->System.out.print(n+" "));

    }
}
