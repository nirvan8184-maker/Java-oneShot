package OOP.Encapsulation;

class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        System.out.println("A new car object has been created.");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Red", 100);
        car1.drive();

        Car car2 = new Car("Dodge", "Yellow", 80);
        car2.drive();
    }
}
