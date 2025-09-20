import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;  // Initial balance
        String pin = "1234";    // Default PIN

        System.out.print("Enter your PIN: ");
        String enteredPin = sc.nextLine();

        if (!enteredPin.equals(pin)) {
            System.out.println("❌ Incorrect PIN. Access denied.");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully. New balance: ₹" + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully. Remaining balance: ₹" + balance);
                    } else {
                        System.out.println("❌ Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
