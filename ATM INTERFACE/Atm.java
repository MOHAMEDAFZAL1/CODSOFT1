import java.util.Scanner;
class BankAccount {
    int balance = 5000;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit successful");
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Please collect your cash");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
public class ATM {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        int choice, amount;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    account.withdraw(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    account.deposit(amount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
