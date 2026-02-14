import java.util.Scanner;

// Main class
public class CodingalBank {

    // ---------------- USER DEFINED EXCEPTIONS ----------------
    static class InvalidMenuChoiceException extends Exception {
        public InvalidMenuChoiceException(String msg) {
            super(msg);
        }
    }

    static class MinimumBalanceException extends Exception {
        public MinimumBalanceException(String msg) {
            super(msg);
        }
    }

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String msg) {
            super(msg);
        }
    }

    static class InvalidAmountException extends Exception {
        public InvalidAmountException(String msg) {
            super(msg);
        }
    }

    // ---------------- BANK ACCOUNT ----------------
    static class BankAccount {
        double balance = 0;
        final double MIN_OPENING_BALANCE = 1000;

        void openAccount(double amount) throws MinimumBalanceException {
            if (amount < MIN_OPENING_BALANCE) {
                throw new MinimumBalanceException(
                        "Opening balance must be at least " + MIN_OPENING_BALANCE);
            }
            balance = amount;
            System.out.println("Account opened successfully.");
        }

        void deposit(double amount) throws InvalidAmountException {
            if (amount <= 0) {
                throw new InvalidAmountException("Deposit must be positive.");
            }
            balance += amount;
            System.out.println("Deposit successful.");
        }

        void withdraw(double amount)
                throws InvalidAmountException, InsufficientFundsException {

            if (amount <= 0) {
                throw new InvalidAmountException("Withdraw must be positive.");
            }

            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful.");
        }

        void showBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("\n--- SBI BANK MENU ---");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter opening amount: ");
                        account.openAccount(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 4:
                        account.showBalance();
                        break;

                    case 5:
                        System.out.println("Thank you for banking.");
                        return;

                    default:
                        throw new InvalidMenuChoiceException("Invalid menu choice.");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
