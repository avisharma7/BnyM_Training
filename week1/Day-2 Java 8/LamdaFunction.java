import java.util.function.BinaryOperator;
import java.util.function.Predicate;

 class LambdaFunction {
    public static void main(String[] args) {
        // Using lambda expression to define a Predicate
        Predicate<Integer> isPositive = (num) -> num > 0;

        // Test the predicate
        System.out.println(isPositive.test(5));    // Output: true
        System.out.println(isPositive.test(-1));   // Output: false

        //2) finding max of two
        // Lambda expression to find maximum of two numbers
        BinaryOperator<Integer> maxFunction = (a, b) -> a >= b ? a : b;

        // Test the lambda expression
        int result1 = maxFunction.apply(5, 3);
        int result2 = maxFunction.apply(10, 20);

        // Print the results
        System.out.println("Maximum of 5 and 3 is: " + result1); // Output: Maximum of 5 and 3 is: 5
        System.out.println("Maximum of 10 and 20 is: " + result2); // Output: Maximum of 10 and 20 is: 20
    }
}
