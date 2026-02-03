package OOP.Abstraction;

public class SavingAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        // Implementation for depositing money into a saving account
        System.out.println("Deposited " + amount + " into Saving Account.");
    }

    @Override
    public void withdraw(double amount) {
        // Implementation for withdrawing money from a saving account
        System.out.println("Withdrew " + amount + " from Saving Account.");
    }

}
