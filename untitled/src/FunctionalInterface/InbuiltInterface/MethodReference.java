package FunctionalInterface.InbuiltInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // 1 using for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2 using enhanced for each loop
        for (String name : names) {
            System.out.println(name);
        }

        // 3 using forEach with an anonymous Consumer implementation
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

        // 4 using forEach with a lambda
        names.forEach(name -> System.out.println(name));

        // 5 using method reference (most concise)
        names.forEach(System.out::println);
    }
}
