package OOP.interfaces;

public class electricCar implements carControl {
    @Override
    public void turnRight() {
        System.out.println("Electric car turning right.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric car turning left.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Electric car applying brakes.");
    }
}
