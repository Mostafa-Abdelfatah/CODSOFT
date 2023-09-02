public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double n) {
        balance += n;
    }

    public void withdraw(double n) {
        if(n > balance)
            System.out.println("sorry you don't have this amount in your account");
        else {
            System.out.println("successful operation");
            balance -= n;
        }
    }
}
