package OOP.interfaces;

public class sportsCar implements carControl {
    @Override
    public void turnRight() {
        System.out.println("Sports car turning right.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports car turning left.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Sports car applying brakes.");
    }
}
