package Collections;
import java.util.ArrayList;
import java.util.List;

class Car{
    String Brand;
            Car (String Brand){
                this.Brand = Brand;
            }
}


public class ListDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();

        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        users.add("Alice"); // allowed as list allows demo

        System.out.println(" All users");

        for (String user : users) {
            System.out.println(user);
        }

        System.out.println("Element using index" + users.get(0));

        // List of objects
        Car car1 = new Car("Hell Cat");
        Car car2 = new Car("BMW");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println(" ==ALL CARS== ");
        for (Car car : carList){
            System.out.println(car.Brand);
        }

    }






}
