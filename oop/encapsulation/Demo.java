package oop.encapsulation;

public class Demo {

    public static void main(String[] args) {
        BankAccount  ba = new BankAccount();
        ba.deposit(23455);
        ba.withdraw(234);

        System.out.println(ba.getbalance());

        Student s1 = new Student();
        s1.setName("ankit");
        System.out.println(s1.getName());

       
       
       
        // ba.balance = 189897; // this is not valid
        // System.err.println(ba.balance); // this is not valid
        
    }
    
}

class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getbalance(){
        return balance;
    }
}

class Student{
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    // Student(String name, int rollNumber, int age, String college){
    //     this.name = name;
    //     this.age = age;
    //     this.rollNumber = rollNumber;
    //     this.college = college;
    // }


    // getters and setters (In real world projects or use cases these would be used with some added conditions only upon which the function would work to either get or set a private value)
    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;
    }




}


