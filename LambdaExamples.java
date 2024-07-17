import java.util.Comparator;
import java.util.function.*;

public class LambdaExamples {
    public static void main(String[] args) {
        // Supplier example
        Supplier<String> supplier = () -> "Hello, world!";
        System.out.println("Supplier Example Output: " + supplier.get());

        // Consumer example
        Consumer<Integer> consumer = (num) -> System.out.println("Consumer Example Output: " + num);
        consumer.accept(10);

        // Function example
        Function<Integer, String> function = (num) -> "Number: " + num;
        System.out.println("Function Example Output: " + function.apply(25));

        // Predicate example
        Predicate<Integer> predicate = (num) -> num > 0;
        System.out.println("Predicate Example Output (Is 10 positive?): " + predicate.test(10));

        // UnaryOperator example
        UnaryOperator<Integer> unaryOperator = (num) -> num * num;
        System.out.println("UnaryOperator Example Output (Square of 5): " + unaryOperator.apply(5));

        // BinaryOperator example
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("BinaryOperator Example Output (Sum of 7 and 3): " + binaryOperator.apply(7, 3));

        // Runnable example
        Runnable runnable = () -> System.out.println("Runnable Example Output: Hello, Java!");
        runnable.run();

        // Comparator example
        Comparator<String> comparator = (str1, str2) -> str1.compareTo(str2);
        System.out.println("Comparator Example Output (Comparison of 'apple' and 'banana'): " + comparator.compare("apple", "banana"));

        // Custom functional interface example
        MyFunctionalInterface myLambda = (num) -> System.out.println("Custom Functional Interface Example Output: Number : " + num);
        myLambda.doSomething(50);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void doSomething(int num);
    }
}
