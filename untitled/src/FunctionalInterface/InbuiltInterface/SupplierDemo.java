package FunctionalInterface.InbuiltInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<Double> randomNo = () -> Math.random();
        System.out.println(randomNo.get());
    }
}
