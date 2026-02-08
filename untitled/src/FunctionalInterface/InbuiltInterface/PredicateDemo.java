package FunctionalInterface.InbuiltInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
   public static void main(String[] args) {
       Predicate<Integer> isEven = (num) -> num % 2 == 0;

       System.out.println(isEven.test(4)); // true
       System.out.println(isEven.test(7)); // false


       BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;
       System.out.println(isSumEven.test(3, 5)); // true
       System.out.println(isSumEven.test(2, 3)); // false
    }
}
