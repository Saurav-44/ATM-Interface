public class ATM {
    
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount >= 0) {
            this.balance += amount;
            System.out.println("Deposited Rs." + amount + " successfully.");
            System.out.println("Available balance: " + this.balance);
        }

        else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance.");
        }

        else {
            this.balance -= amount;
            System.out.println("Withdrawn Rs." + amount + " successfully.");
            System.out.println("Available balance: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

}
