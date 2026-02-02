import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {

        ATM atm = new ATM(0);
        Scanner sc = new Scanner(System.in);

        int ch;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Current Balance: Rs." + atm.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs.");
                    atm.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs.");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Thank you...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }  

        } while (ch != 4); 

        
    }
}
