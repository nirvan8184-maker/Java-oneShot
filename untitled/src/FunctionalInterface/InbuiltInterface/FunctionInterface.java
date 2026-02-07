package FunctionalInterface.InbuiltInterface;

import java.util.function.Function;

//using Function Interface


public class FunctionInterface {

    public static Function<Integer, Integer> addFunction = (a) -> a + 10;

    public static Function<Integer, Integer> subtractFunction = (a) -> a - 5;


    //We can also change the definition
    public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subtractFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(5)); // Output: 15
        System.out.println(subtractFunction.apply(10)); // Output: 5
        System.out.println(combinedFunction.apply(10)); // Output: 15
    }
}
