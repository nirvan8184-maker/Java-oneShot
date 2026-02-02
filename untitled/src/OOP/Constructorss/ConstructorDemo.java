package OOP.Constructorss;

import OOP.Constructorss.Car; // Updated import statement to reference the correct Car class

public class ConstructorDemo {
    public static void main(String[] args) {

        // Correct instantiation of the Car object
        OOP.Constructorss.Car car1 = new OOP.Constructorss.Car("BMW", "Red", 100);
        car1.drive(); // Using the car1 object to remove the unused variable warning

        // Correct instantiation of the Car object
        OOP.Constructorss.Car car2 = new OOP.Constructorss.Car("Dodge", "Yellow", 80); // Corrected instantiation
        car2.drive(); // Using the car2 object to remove the unused variable warning
    }
}
