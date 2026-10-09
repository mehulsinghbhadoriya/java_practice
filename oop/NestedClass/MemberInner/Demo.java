package oop.NestedClass.MemberInner;
class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    // Member Inner Class
    class InterestCalculator {

        private double rate;

        public InterestCalculator(double rate) {
            this.rate = rate;
        }

        public double calculateInterest() {
            return balance * rate / 100;
        }
    }
}

public class Demo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(50000);

        BankAccount.InterestCalculator calculator =
                account.new InterestCalculator(7);

        double interest = calculator.calculateInterest();

        System.out.println("Interest: " + interest);
    }
}