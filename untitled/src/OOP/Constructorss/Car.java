package OOP.Constructorss;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed) {
        System.out.println("A new car object has been created.");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
}
