import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount = new BankAccount(1000);
    final private Scanner in = new Scanner(System.in);

    private void deposit() {
        System.out.println();
        System.out.print("please enter the money: ");
        bankAccount.deposit(in.nextDouble());
        System.out.println();

    }

    private void withdraw() {
        System.out.println();
        System.out.print("please enter the amount you want to withdraw: ");
        bankAccount.withdraw(in.nextDouble());
        System.out.println();

    }
    private void checkAccount() {
        System.out.println();
        System.out.println("your bank account have " + bankAccount.getBalance());
        System.out.println();
    }

    public void atmRun() {
        int x;
        while (true) {
            System.out.println("1) check your balance");
            System.out.println("2) deposit");
            System.out.println("3) withdraw");
            System.out.println("4) exit");
            System.out.print("please enter the number of your operation: ");
            x = in.nextInt();
            if(x == 1){
                checkAccount();
            }
            else if(x == 2) {
                deposit();
            }
            else if(x == 3) {
                withdraw();
            }
            else if(x == 4) {
                System.out.println();
                System.out.println("thank you see you soon");
                break;
            }
            else {
                System.out.println();
                System.out.println("please enter a valid number");
                System.out.println();
            }
        }
    }
}
