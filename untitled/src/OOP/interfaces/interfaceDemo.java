package OOP.interfaces;

public class interfaceDemo {
    public static void main(String[] args) {
//        electricCar e1 = new electricCar();
//        e1.turnLeft();
//        e1.turnRight();
//        e1.applyBrakes();

        carControl Tesla = new electricCar();
        Tesla.turnLeft();

        carControl Dodge = new sportsCar();
        Dodge.applyBrakes();
    }
}
