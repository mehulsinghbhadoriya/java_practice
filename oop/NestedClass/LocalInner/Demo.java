package oop.NestedClass.LocalInner;
class BankAccount {

    private double balance = 50000;

    public void calculateInterest() {

        // LOCAL INNER CLASS
        // Important: the class is declared inside a method
        class InterestCalculator {

            private double rate = 7;

            public double calculate() {
                // Inner class can access outer class's
                // non-static variable directly
                return balance * rate / 100;
            }
        }

        // Create object inside the same method
        InterestCalculator calculator = new InterestCalculator();

        System.out.println(calculator.calculate());
    }
}

public class Demo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.calculateInterest();
    }
}