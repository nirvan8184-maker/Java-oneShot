package FunctionalInterface;

@FunctionalInterface
interface BookAction {
    void performAction();
}

//Functional Interface with parameter
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}


public class functionalInterfaceDemo {
    public static void main(String[] args) {
        // anonymous class implementation
        BookAction action1 = new BookAction() {
            @Override
            public void performAction() {
                System.out.println("Performing book action: Borrowing a book.");
            }
        };
        action1.performAction();

        // instead we will use a lambda function
        BookAction action2 = () -> {
            System.out.println("Performing book action: Borrowing a book.");
        };
        action2.performAction();

        // Enhancing the lambda function
        BookAction action3 = () -> System.out.println("Performing book action: Borrowing a book.");
        action3.performAction();


        // using the parameterized functional interface
        Operation operation1 = (a, b) -> a + b;
        System.out.println("Result of addition: " + operation1.add(5, 3));

    }
}
