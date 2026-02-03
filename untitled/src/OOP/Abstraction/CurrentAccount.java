package OOP.Abstraction;

public class CurrentAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        // Implementation for depositing money into a current account
        System.out.println("Deposited " + amount + " into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        // Implementation for withdrawing money from a current account
        System.out.println("Withdrew " + amount + " from Current Account.");
    }

}
