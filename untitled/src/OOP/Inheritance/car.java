package OOP.Inheritance;

public class car extends vehicle {
    private int doors;

    public car(String brand, int speed , int doors) {
        super(brand, speed); // super means passing value to the main class constructor
                             // super cals parent class constructor
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
