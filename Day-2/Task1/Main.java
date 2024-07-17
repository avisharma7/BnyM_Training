package Task1;

public class Main {
    public static void main(String[] args) {

        //using lamba expression to implement funcional interface for addition
        functionalInterface addition = (a,b)-> a+b; //(parameter)->{Body}
//addition is the name of variable of type functionalInterface that holds lamba expression
        //using lambda expression to implement functional interface for mulitply
        functionalInterface multiply = (a,b)-> a*b;

        //call the methods
        int sum  = addition.operate(2,4);
        int product = multiply.operate(2,4);

        System.out.println("Sum: " + sum);
        System.out.println("Product:" + product);
    }
}
