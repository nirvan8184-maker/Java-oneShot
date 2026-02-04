package Basics;

public class javaDataTypes {
    public static void main(String[] args) {

        // Primitive Data Types

        String name = "JAVA";
        char a = 'A';
        boolean b = true;
        int number = 111;

        byte b1 = 127; // Fixed: Changed value to 127 as byte range is -128 to 127

        // byte and short are not used frequently, but it can be used when there is a shortage of memory or you know the exact value that will not be exceeded

        // non-primitive data types
        // strings, arrays, classes, interface
        // string is a non-primitive data type as it is similar to array of characters and it has Basics.methods to perform certain operations

        int[] marks = {1,2,3,4};
        //array is accessed thru index starting from 0
        System.out.println(marks[0]); // will print 1
        System.out.println(marks[1]); // will print 2
        System.out.println(marks[2]); // will print 3
    }
}
