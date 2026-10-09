package oop.NestedClass.Anonymous;

interface InterestCalculator {

    double calculate(double balance);
}

class BankAccount {

    private double balance = 50000;

    public void calculateInterest() {

        // ANONYMOUS INNER CLASS
        // Important: there is NO class name here
        InterestCalculator calculator = new InterestCalculator() {

            // We implement the interface method here
            @Override
            public double calculate(double balance) {
                return balance * 7 / 100;
            }
        };

        System.out.println(calculator.calculate(balance));
    }
}

public class Demo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.calculateInterest();
    }
}