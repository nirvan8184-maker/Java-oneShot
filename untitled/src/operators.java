public class operators {
    public static void main(String[] args) {
        //a + b = addition
        // a - b = subtraction
        // a * b = multiplication
        // a / b = division
        // a % b = remainder after division

        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // the answer is three
        System.out.println("a % b = " + (a % b)); // the answer is one


        // unary operators
        int x = 5;
        System.out.println("++x = " + (++x)); // using the variable after increasing its value by one
        System.out.println("x++ = " + (x++)); // using the variable then increasing its value by one
        System.out.println("!(x > 0) = " + !(x > 0) );

        // Assignment operators
        int y = 10;
        y += 5; // y = y + 5
        System.out.println("y += 5 -> " + y);
        y -= 3; // y = y - 3
        System.out.println("y -= 3 -> " + y);

        // Comparison operators
        int age = 18;
        System.out.println("age == 18 -> " + (age == 18)); //exactly equal
        System.out.println("age != 18 -> " + (age != 18)); //not equal

        //conditional operators
        // only two -----> 1. && (AND) 2. || (OR)
        // used when there is a need to evaluate some booleans together

        boolean isAdult = true;
        boolean hasID = false;

        if (isAdult && hasID) {
            System.out.println("You can enter.");
        } else {
            System.out.println("You cannot enter.");
        }

        // Ternary operator
        // syntax ---> (condition) ? (True statement) : (False statement)

        System.out.println((isAdult || hasID) ? "You can enter." : "You cannot enter.");

    }
}
