public class controlFlow {
    /*
    Control flow means how your program executes statements based on conditionals or loops.
    Instead of running code line by line , we can tell Java :

    1. "Do this if something is true"
    2. "Repeat this until a condition changes"
    3. "choose one path from many"

    Java mainly uses the following control flow statements:
    1. decision making statements: if, if-else, switch
    2. looping statements: for, while, do-while, enhanced for each loop
    3. jump statements: break, continue, return

     */

    public static void main(String[] args) {
        // if-else
        int age = 20;
        if (age > 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // if-else ladder
        int marks = 90;
        if (marks > 90) {
            System.out.println("Grade A");
        } else if (marks > 75) {
            System.out.println("Grade B");
        } else if (marks > 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // switch
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
                break;
            case "Friday":
                System.out.println("Last day of the week");
                break;
            default:
                System.out.println("Midweek days");
                break;
        }

        // loops
        for (int i = 0; i < 10; i++) {
            System.out.println("Count: " + i);
        }

        // While loop
        int num = 3;
        while (num > 0) {
            System.out.println("Num: " + num);
            num--;
        }

        // do-while loop
        int n = 3;
        do {
            System.out.println("N: " + n);
            n--;
        } while (n > 0);

        // Enhanced for each loop
        String[] fruits = {"Apple", "Banana"};
        for (String a : fruits) {
            System.out.println("Fruit: " + a);
        }

        // Iterating an array using for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }

        // Jump statements
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 3) break;
            System.out.println("Count: " + i);
        } // Using break on condition i == 3 will exit the loop when i is 3.

        // continue
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            System.out.println("Count: " + i);
        } // Using continue on condition i == 3 will skip the iteration when i is 3.
    }
}
