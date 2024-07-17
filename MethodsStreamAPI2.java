import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodsStreamAPI2 {
    //2) Terminal Operations
    // Terminal operations produce a result or a side-effect and mark the end of the stream pipeline.

    public static void main(String [] args){

        /*
        1) forEach(Consumer<? super T> action)
Performs an action for each element of the stream.
         */
        List<String> myList = Arrays.asList("a", "b", "c");
        myList.stream().forEach(System.out::print);
        System.out.println();

        /*
        2) forEachOrdered(Consumer<? super T> action)
Performs an action for each element of the stream, in the encounter order of the stream.
         */
        List<String> my = Arrays.asList("a", "b", "c","a");
        my.stream().forEachOrdered(System.out::print);
        System.out.println();

        /*
      3)  toArray()
Returns an array containing the elements of this stream.
         */
        List<String> ll = Arrays.asList("a", "v", "i");
        Object[] array = ll.stream().toArray();
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();

        /*
        toArray(IntFunction<A[]> generator)

Returns an array containing the elements of this stream, using the provided generator function.
         */
        List<String> mylis = Arrays.asList("a", "b", "c");
        String[] arr = mylis.stream().toArray(String[]::new);
        for (String element : arr) {
            System.out.print(element);
        }
        System.out.println();

        /*
        5) reduce(T identity, BinaryOperator<T> accumulator)

Performs a reduction on the elements, using the provided identity value and an associative accumulation function, and returns the reduced value.
         */

        List<Integer> a = Arrays.asList(1, 2, 3);
        Integer sum = a.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        /*
        6) reduce(BinaryOperator<T> accumulator)

Performs a reduction on the elements, using an associative accumulation function, and returns an Optional describing the reduced value, if any.
         */
        List<Integer> myy = Arrays.asList(1,2,3);
        Optional<Integer> summ = myy.stream().reduce(Integer::sum);
        summ.ifPresent(System.out::println);

        /*
        collect(Collector<? super T, A, R> collector)
        Performs a mutable reduction operation on the elements, using a Collector
         */
        List<String> avi = Arrays.asList("a", "v", "i");
        List<String> result = avi.stream().collect(Collectors.toList());
        result.stream().forEach(System.out:: print);
        System.out.println();

        List<String> aviral = Arrays.asList("a", "s", "i");
        StringBuilder res = aviral.stream().collect(
                StringBuilder::new,       // Supplier: creates a new StringBuilder
                StringBuilder::append,    // Accumulator: appends each element to the StringBuilder
                StringBuilder::append     // Combiner: combines two StringBuilders (used in parallel processing)
        );

        System.out.println(res);
        res.append("a");
        System.out.println(res);

        /*
        9) min(Comparator<? super T> comparator)
Returns the minimum element of this stream according to the provided comparator.
         */
        List<String> mini = Arrays.asList("d", "b", "a", "c");
        Optional<String> min = mini.stream().min(String::compareTo);
        min.ifPresent(System.out::println);

        List<Integer> minii = Arrays.asList(1,2,3,4,5);
        Optional<Integer> minn = minii.stream().min(Integer::compareTo);
        minn.ifPresent(System.out::println);

        /*
        10) max(Comparator<? super T> comparator)
Returns the maximum element of this stream according to the provided comparator.
         */
        List<Integer>myint = Arrays.asList(5,4,23,7,3,3);
        Optional<Integer> maxii = myint.stream().max(Integer::compareTo);
        maxii.ifPresent(System.out::println);

        /*
        11) count()
Returns the count of elements in this stream.
         */

        List<String> str = Arrays.asList("a", "b", "c");
        long count = str.stream().count();
        System.out.println(count);

        /*
        12) anyMatch(Predicate<? super T> predicate)
Returns whether any elements of this stream match the provided predicate.
         */
        List<String> am = Arrays.asList("a", "b", "c");
        boolean match = am.stream().anyMatch(s -> s.equals("a"));
        System.out.println(match);

        /*
        13) allMatch(Predicate<? super T> predicate)

Returns whether all elements of this stream match the provided predicate.
         */
        List<String> allm = Arrays.asList("ab", "b", "c");
        boolean matchh = allm.stream().allMatch(s -> s.length() == 1); //len(ab) != 1 -> returns false
        System.out.println(matchh);

/*
noneMatch(Predicate<? super T> predicate)
Returns whether no elements of this stream match the provided predicate.
 */
        List<String> nm = Arrays.asList("a", "b", "c");
        boolean nomatch = nm.stream().noneMatch(s -> s.equals("d")); //returns true
        System.out.println(nomatch);
/*
findFirst()
Returns an Optional describing the first element of this stream.
 */
        List<String> ff = Arrays.asList("&","s","2");
        Optional<String> first = ff.stream().findFirst();
        first.ifPresent(System.out::println);

        /*
        16) findAny()
Returns an Optional describing some element of this stream.
         */
        Optional<String>fa = ff.stream().findAny();
        fa.ifPresent(System.out::println);
















    }
}
