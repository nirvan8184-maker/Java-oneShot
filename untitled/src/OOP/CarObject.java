package OOP;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.brand = "BMW";
        car1.color = "Red";
        car1.drive();

        Car car2 = new Car();
        car2.speed = 80;
        car2.brand = "dodge";
        car2.color = "yellow";
        car2.drive();
    }

}
