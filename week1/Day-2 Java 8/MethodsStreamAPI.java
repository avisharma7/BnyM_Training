import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;

/*
key methods provided by Stream interface:
1) Intermediate Operations
-> Intermediate operations return a new stream, allowing for further operations to be chained.
 These operations are lazy, meaning they are not executed until a terminal operation is invoked.

2) Terminal Operations
->  Terminal operations produce a result or a side-effect and mark the end of the stream pipeline.
 */
public class MethodsStreamAPI {
//Intermediate Operations
    public static void main(String [] args){

        //1) filter(Predicate<? super T> predicate)
        // Returns a stream consisting of the elements that match the given predicate.

        List<String> myList = Arrays.asList("a", "b", "c", "d");
        myList.stream().filter(s -> s.equals("a")).forEach(System.out::println);

        /*
       2) map(Function<? super T, ? extends R> mapper)
Returns a stream consisting of the results of applying the given function to the elements of the stream.
         */

        myList.stream().map(String:: toUpperCase).forEach(System.out:: print);

        System.out.println();
        /*
        flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)

Returns a stream consisting of the results of replacing each element with the contents of a mapped stream produced by applying the provided mapping function.
         */
        List<List<String>> list = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
        list.stream().flatMap(Collection::stream).forEach(System.out::print);
        System.out.println();

        /*
       4) distinct()
Returns a stream consisting of the distinct elements.
         */
        List<String> l = Arrays.asList("a", "b", "a");
        l.stream().distinct().forEach(System.out::print);
        System.out.println();

        /*
        5) sorted()
Returns a stream consisting of the elements in a sorted order.
         */
        l.stream().sorted().forEach(System.out::print);
        System.out.println();

        /*
        6) sorted(Comparator<? super T> comparator)
Returns a stream consisting of the elements in a sorted order according to the provided comparator.
         */
        l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        /*
        peek(Consumer<? super T> action)
Returns a stream consisting of the elements of this stream,
 additionally performing the provided action on each element.
         */
        List<String> ml = Arrays.asList("a", "b", "c", "a");
        ml.stream().peek(System.out::print).forEach(e -> {});

        /*
        8)limit(long maxSize)
        Returns a stream consisting of the elements, truncated to be no longer than the specified size.
         */
        System.out.println();
        List<String> m = Arrays.asList("a", "b", "c", "d");
        m.stream().limit(3).forEach(System.out::print);
        System.out.println();

        /*
        9) skip(long n)
        Returns a stream consisting of the remaining elements after discarding the first n elements.
         */
        m.stream().skip(2).forEach(System.out:: print);
        System.out.println();







    }



}
