package OOP.Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount();

        savingAccount.deposit(99);

        BankAccount savingAccount1 = new SavingAccount();
        savingAccount1 = new CurrentAccount();
        savingAccount1.withdraw(50);
    }
}
