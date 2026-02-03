package OOP.Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
       car c1 = new car("BMW", 200, 2);

       c1.displayInfo();

       bike b1 = new bike("MV Agusta", 180, 2);

       b1.displayInfo();

       c1.start();
       b1.start();


       vehicle v1 = new vehicle("supra", 220);
         v1.start();

         // Method overloading  --- runtime polymorphism
         vehicle v2 = new car("Audi", 240, 4);
         v2.start();

         vehicle v3 = new bike("KTM", 210, 2);
         v3.start();

         b1.start("Hello my friend");
    }
}
