package oop.Inheritance;


public class Demo2 {

    public static void main(String[] args) {

        Student s =  new Student();
        Engstudent es = new Engstudent();
        CseStudent cs = new CseStudent();
        Medstudent ms = new Medstudent();


        es.attendlab();
        es.markattend(); // derived class object using the method of parent class
        s.markattend();
        // s.attenlab(); // This is invalid derived class can use any method of the parent class but parant class cannot use the method of its derived class

        // Example of multilevel inheritance
        cs.markattend();
        cs.attendcselab();
        cs.attendlab();

        // hierarchal inheritance
        ms.attendlab();
        ms.markattend();
        
    }
    
}

class Student{
    String name;
    int age;

    void markattend(){
        System.out.println("Attendance Marked");
    }
}

class Engstudent extends Student{

    void attendlab(){
        System.out.println("Lab attended");
    }

}
class CseStudent extends Engstudent{
    void attendcselab(){
        System.out.println("CSE lab attended");
    }

}

class Medstudent extends Student{
    void attendlab(){
        System.out.println("Medical lab attended");
    }
}