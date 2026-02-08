package FunctionalInterface.InbuiltInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> addConsumer = (a, b) -> System.out.println("Sum: " + (a + b));
        addConsumer.accept(10,30);
    }
}
