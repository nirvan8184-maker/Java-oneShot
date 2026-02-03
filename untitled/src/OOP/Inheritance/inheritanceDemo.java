package OOP.Inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {
       car c1 = new car("BMW", 200, 2);

       c1.displayInfo();

       bike b1 = new bike("MV Agusta", 180, 2);

       b1.displayInfo();
    }
}
