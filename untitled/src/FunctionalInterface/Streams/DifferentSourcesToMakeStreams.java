package FunctionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesToMakeStreams {
    /*
    From Collections : e.g., collections.stream().
    From Arrays : e.g, Arrays.stream().
    From specific value: e.g, Stream.of("a", "b", "c").
    From Functions: e.g, Stream.iterate(0, n -> n + 2 ).
    From files: e.g, Files.lines(path).
    Empty Stream: e.g, Stream.empty().
     */

    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> integerStream = numbers.stream();

        integerStream.forEach(System.out::println);


        // From Arrays

        int[] numberArray = {1, 2, 3, 4};

        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);



    }
}
