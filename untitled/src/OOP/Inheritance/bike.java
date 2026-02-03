package OOP.Inheritance;

public class bike extends vehicle{
    private int mirrors;

    public bike(string brand, int speed, int mirrors) {
        super(brand, speed);
        this.mirrors = mirrors;
    }
}
