import java.util.Scanner;

// Custom exception for invalid PIN
class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom exception for invalid transaction amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Custom exception for withdrawal limit
class WithdrawalLimitException extends Exception {
    public WithdrawalLimitException(String message) {
        super(message);
    }
}

public class ATM_Transaction_System {

    static double balance = 10000;
    static int correctPIN = 1234;
    static double dailyWithdrawal = 0;
    static final double withdrawalLimit = 20000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // PIN Verification
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin != correctPIN) {
                throw new InvalidPINException("Invalid PIN!");
            }

            System.out.println("PIN verified successfully.");

            int choice;

            do {
                System.out.println("\n----- ATM MENU -----");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                try {
                    switch (choice) {

                        case 1:
                            // Balance Enquiry
                            System.out.println("Current Balance: Rs. " + balance);
                            break;

                        case 2:
                            // Withdrawal
                            System.out.print("Enter withdrawal amount: ");
                            double withdraw = sc.nextDouble();

                            if (withdraw <= 0) {
                                throw new InvalidAmountException(
                                        "Transaction amount must be greater than zero.");
                                throw new InvalidAmountException("Transaction amount must be greater than zero.");
                            }

                            if (withdraw > balance) {
                                throw new InsufficientBalanceException(
                                        "Insufficient balance!");
                                throw new InsufficientBalanceException("Insufficient balance!");
                            }

                            if (dailyWithdrawal + withdraw > withdrawalLimit) {
                                throw new WithdrawalLimitException(
                                        "Daily withdrawal limit exceeded!");
                                throw new WithdrawalLimitException("Daily withdrawal limit exceeded!");
                            }

                            balance = balance - withdraw;
                            @@ -141,4 +138,4 @@

                                sc.close();
                    }
                }
            }