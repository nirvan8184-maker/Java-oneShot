package FunctionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamsDemo {
    static void main(String[] args) {
        //Streams is like a pipeline / or like an assembly line
        //Streams are used to process collections of objects
        //Streams are not data structures, they are a way to process data

        List<String> items = Arrays.asList("Apple, Orange, Banana");

        for (String item : items) {
            System.out.println(item);
        }

        // using Streams
        Stream<String> stream = items.stream();
//        stream.forEach(item -> System.out.println(item));
        stream.forEach(System.out::println);

        // filtering using Streams
        Stream<String> NewStream = items.stream();

        Stream<String> filteredStream = NewStream.filter(item -> item.startsWith("A"));

        filteredStream.forEach(System.out::println);



        //Use Cases:
        // 1. Filtering
        // 2. Mapping
        // 3. Aggregation
        // 4. Searching
        // 5. Iteration

    }
}
