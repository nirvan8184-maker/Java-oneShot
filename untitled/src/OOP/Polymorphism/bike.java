package OOP.Polymorphism;

public class bike extends vehicle {
    private int mirrors;

    public bike(String brand, int speed, int mirrors) { // Fixed: Changed 'string' to 'String'
        super(brand, speed);
        this.mirrors = mirrors;
    }

    @Override
    public void start() {
        System.out.println("Starting Bike....");
    }
    public void start(String greet) {
        System.out.println("Starting Bike...." + greet);
    }  // this is called method overloading

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }
}
