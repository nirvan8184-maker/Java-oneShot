package FunctionalInterface.InbuiltInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExample {
    static void main(String[] args) {
        // we have to make something like <title> costs $<price>
        //since it has two inputs and a single output we can use BiFunction

        BiFunction<String, Double, String> format = (title, price) -> title + " costs $" + price;

        System.out.println(format.apply("Bleach", 29.99));
        System.out.println(format.apply("One Piece", 35.49));
        System.out.println(format.apply("Berserk", 43.29));


        //if we directly want to print the stuff we can use BiConsumer instead of BiFunction since it doesn't return anything
            BiConsumer<String, Double> printFormat = (title, price) -> System.out.println(title + " costs $" + price);

            printFormat.accept("Naruto", 19.99);
            printFormat.accept("Dragon Ball", 24.99);
            printFormat.accept("Attack on Titan", 39.99);

        // if we want to see if something is expensive or not -------- since isExpensive will be a boolean we can always use predicate for serving that purpose
        Predicate<Double> isExpensive = price -> price > 30.0;
        System.out.println("Is Bleach expensive? " + isExpensive.test(29.99));
        System.out.println("Is One Piece expensive? " + isExpensive.test(35.49));
        System.out.println("Is Berserk expensive? " + isExpensive.test(43.29));
    }
}
