package OOP.Inheritance;

public class bike extends vehicle {
    private int mirrors;

    public bike(String brand, int speed, int mirrors) { // Fixed: Changed 'string' to 'String'
        super(brand, speed);
        this.mirrors = mirrors;
    }

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }
}
