public class variableNamesDemo {
    /*
    Rules
    1. its case sensitive
    2. it cannot be a reserved keyword
    3. it must begin with a letter, dollar sign or underscore
    4. use uppercase with underscores for constants
    * */
    public static void main(String[] args) {
        int myVariable = 10;
        int MyVariable = 20; // Different from myVariable due to case sensitivity
        final int MAX_VALUE = 100; // Constant variable

        System.out.println("myVariable: " + myVariable);
        System.out.println("MyVariable: " + MyVariable);
        System.out.println("MAX_VALUE: " + MAX_VALUE);

        // Invalid variable name

        //int 2ndVariable = 30; // This will cause a error as variables cant start with a number
       // int class = 40; // This will cause a error as 'class' is a reserved keyword

        // example shoving case sensitivity
        int data = 50;
        int Data = 60; // Different from data due to case sensitivity
    }
}
