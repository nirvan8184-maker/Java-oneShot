package ExceptionHandling;

import java.sql.SQLOutput;

public class ExceptionDemo {
    public static void main(String[] args) {
        // int a = 10;
        // int result = 100/0;
        //System.out.println("Done");

        try {
            //Exception Generating Statements
            int result = 100/0;

        } catch ( Exception e) {
            // Exception Handling Statements
            System.out.println("in Catch block");
        }

        int[] a = { 1,2,3};


        try {
            System.out.println(a[6]);
        } catch (Exception e) {
//            System.out.println("There is no element on index 6");
            java.util.Objects.requireNonNull(System.out).println("There is no element on index 6");

        }
    }
}
