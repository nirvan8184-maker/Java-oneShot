package FunctionalInterface.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstStreamDemo {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2, 33, 4, 5, 6, 7, 8, 9);



        //To-Do ----- Create a list with even number from Number list

        // Using for loop
        List<Integer> evenNumbers1 = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers1.add(num);
            }
        }
        System.out.println("Even numbers using for loop: " + evenNumbers1);

        // Using Streams

        //step 1 we will make numbers a stream
        Stream<Integer> integerStream1 = numbers.stream();
        // Intermediate operation
        Stream<Integer> integerStream2 = integerStream1.filter(num -> num % 2 == 0);  // filter is a method from stream which requires a predicate as an argument
        List<Integer> evenNumbers2 = integerStream2.toList(); // terminal operation
        System.out.println("Even numbers using streams: " + evenNumbers2);


        //using stream but more concise way
        List<Integer> evenNumbers3 = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        System.out.println("Even numbers using streams in concise way: " + evenNumbers3);
    }
}
