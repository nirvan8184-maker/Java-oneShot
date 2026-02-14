package FunctionalInterface.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    static void main(String[] args) {
        // reduce() -- takes two things an identityu value and an accumlator function and it reduces the stream to a single value by applying the accumulator function to the elements of the stream and the identity value


        Stream<Integer> integerSum = numbers.stream();
//        int sum = integerSum.reduce(0, (a, b) -> a + b);

        //identity value is 0 because we are adding the numbers, if we were multiplying the numbers then the identity value would be 1

        int sum = integerSum.reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // collect()  -- we can collect the results of a stream
        // collecting all the even numbers out of the numbers list and putting them in a new list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);


        Set<Integer> evenNumbersSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Even Numbers: " + evenNumbersSet);

        // find & Match ---- used in finding something in a list or checking if something matches a condition
        // findFirst() -- returns an Optional containing the first element of the stream that matches the condition
        // findAny() -- returns an Optional containing any element of the stream that matches the condition
        // allMatch() -- returns true if all elements of the stream match the condition
        // anyMatch() -- returns true if any element of the stream matches the condition
        // noneMatch() -- returns true if no element of the stream matches the condition

        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has40 = numbers.stream()
                .anyMatch(n -> n ==40); // false
        System.out.println("Has 40: " + has40);

        boolean has4 = numbers.stream()
                .anyMatch(n -> n ==4); // true
        System.out.println("Has 4: " + has4);



        // iteration -- using for each
        numbers.stream().forEach(System.out::println);
    }
}
