package FunctionalInterface.InbuiltInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
  public   static void main(String[] args) {
        Consumer<String> consumer1 = (str) -> System.out.println("Consumer 1: " + str);

        Consumer<String> consumer2 = System.out::println; // Method reference

        consumer1.accept("Hello");

        consumer2.accept("Method Reference Example");

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
      Consumer<Integer> multiplyByTwo = (num) -> System.out.println(num * 2);
        numbers.forEach(multiplyByTwo); // we can directly pass consumer into a forEach method

    }
}
